package com.wakeup.qcloud;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.io.CharArrayReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.bouncycastle.util.Arrays;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.wakeup.qcloud.domain.IMConfigDO;
import com.wakeup.qcloud.domain.LiveConfigDO;
import com.wakeup.qcloud.domain.MixStreamBody;
import com.wakeup.qcloud.domain.MixStreamDO;
import com.wakeup.qcloud.domain.MixStreamResponse;
import com.wakeup.qcloud.domain.MixStreamBody.Interface;
import com.wakeup.qcloud.listener.AbstractIMMsgListener;
import com.wakeup.qcloud.listener.AbstractLiveMsgListener;
import com.wakeup.qcloud.listener.QCloudMsgListener;
import com.wakeup.qcloud.listener.QCloudMsgResponse;
import com.wakeup.qcloud.utils.Base64Url;
import com.wakeup.qcloud.utils.HttpClientUtil;
import com.wakeup.qcloud.utils.RandomUtil;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class DefaultQCloudClient implements QCloudClient {
	private final static String MIX_STREAM_URL = "http://fcgi.video.qcloud.com/common_access";
	
	private IMConfigDO imConfig;
	private LiveConfigDO liveConfig;
	private LoadingCache<String, String> sigCache;
	
	/**
	 * 只需要云通信的初始化
	 */
	public DefaultQCloudClient(IMConfigDO imConfig) {
		this.imConfig = imConfig;
		initSigCache();
	}
	
	private void initSigCache() {
		this.sigCache = CacheBuilder.newBuilder()
				.expireAfterAccess(29, TimeUnit.DAYS)
				.build(new CacheLoader<String, String>() {
					@Override
					public String load(String key) throws Exception {
						long expire = 3600 * 24 * 30;// 30天
						return getUserSig(key, expire);
					}
				});
	}
	/**
	 * 只需要直播的初始化
	 */
	public DefaultQCloudClient(LiveConfigDO liveConfig) {
		this.liveConfig = liveConfig;
	}
	/**
	 * 要直播&云通信的初始化
	 */
	public DefaultQCloudClient(IMConfigDO imConfig,LiveConfigDO liveConfig) {
		this.imConfig = imConfig;
		this.liveConfig = liveConfig;
		initSigCache();
	}

	private <T extends QCloudResponse> String getIMRequestUrl(QCloudRequest<T> request) throws QCloudException{
		StringBuilder builder = new StringBuilder(request.getRequestUrl());
		try {
			builder.append("?")
			.append("sdkappid=").append(imConfig.getSdkAppId())
			.append("&identifier=").append(imConfig.getIdentifier())
			.append("&usersig=").append(sigCache.get(imConfig.getIdentifier()))
			.append("&random=").append(RandomUtil.getRandomNumber(32))
			.append("&contenttype=json&apn=1");
			return builder.toString();
		} catch (ExecutionException e) {
			throw new QCloudException(e);
		}
	}
	
	private <T extends QCloudResponse> Map<String, Object> getLiveRequestParams(QCloudRequest<T> request){
		String timestamp = Long.toHexString(System.currentTimeMillis()/1000);
		Map<String, Object> params = request.getTextParams();
		params.put("cmd", liveConfig.getSdkAppId());//即直播APPID，用于区分不同客户的身份
		params.put("t", timestamp);
		String sign = DigestUtils.md5Hex(liveConfig.getKey()+timestamp);
		params.put("sign", sign);
		params.putAll(request.getTextParams());
		return params;
	}
	
	@Override
	public <T extends QCloudResponse> T execute(QCloudRequest<T> request)throws QCloudException {
		String url = null;
		if(request.getService() == QCloudBiz.TIM){
			url = getIMRequestUrl(request);
		}else if(request.getService() == QCloudBiz.LIVE){
			url = request.getRequestUrl();
		}else{
			throw new QCloudException("Unsupport QCloud Service Request.");
		}
		try {
			String res = null;
			if(request.getRequestMethod() == RequestMethod.POST){
				res = HttpClientUtil.post(url, request.getTextParams());
			}else if(request.getRequestMethod() == RequestMethod.GET){
				Map<String, Object> params = getLiveRequestParams(request);
				res = HttpClientUtil.get(url,params);
			}
			if(isNotBlank(res)){
				return JSON.parseObject(res, request.getResponseClass());
			}
		} catch (Throwable e) {
			throw new QCloudException(e);
		}
		throw new QCloudException("Request qcloud response null.");
	}
	
	@Override
	public QCloudMsgResponse doMsgProcess(QCloudMsgListener msgListener,String body,Map<String,Object> urlParams) throws QCloudException {
		if(msgListener instanceof AbstractLiveMsgListener){
			return msgListener.doProcess(body,urlParams, liveConfig.getKey());
		}else if(msgListener instanceof AbstractIMMsgListener){
			return msgListener.doProcess(body,urlParams, imConfig.getSdkAppId());
		}
		throw new QCloudException("UnSupported QCloudMsgListener,msgListener="+msgListener);
	}

	@Override
	public String getUserSig(String identifier, long expire)throws QCloudException {
		try {
			 	Security.addProvider(new BouncyCastleProvider());
		        Reader reader = new CharArrayReader(imConfig.getPrivateKey().toCharArray());
		        JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
		        PEMParser parser = new PEMParser(reader);
		        Object obj = parser.readObject();
		        parser.close();
		    	PrivateKey privKeyStruct = converter.getPrivateKey((PrivateKeyInfo) obj);
				
				String jsonString = "{" 
				+ "\"TLS.account_type\":\"" + 0 +"\","
				+"\"TLS.identifier\":\"" + identifier +"\","
				+"\"TLS.appid_at_3rd\":\"" + 0 +"\","
			    +"\"TLS.sdk_appid\":\"" + imConfig.getSdkAppId() +"\","
				+"\"TLS.expire_after\":\"" + expire +"\","
		        +"\"TLS.version\": \"201512300000\""
				+"}";
				
				String time = String.valueOf(System.currentTimeMillis()/1000);
				String SerialString = 
					"TLS.appid_at_3rd:" + 0 + "\n" +
					"TLS.account_type:" + 0 + "\n" +
					"TLS.identifier:" + identifier + "\n" + 
					"TLS.sdk_appid:" + imConfig.getSdkAppId() + "\n" + 
					"TLS.time:" + time + "\n" +
					"TLS.expire_after:" + expire +"\n";
				
				//Create Signature by SerialString
				Signature signature = Signature.getInstance("SHA256withECDSA", "BC");
				signature.initSign(privKeyStruct);
				signature.update(SerialString.getBytes(Charset.forName("UTF-8")));
				byte[] signatureBytes = signature.sign();
				
				String sigTLS = Base64.encodeBase64String(signatureBytes);
				
				//Add TlsSig to jsonString
			    JSONObject jsonObject= JSON.parseObject(jsonString);
			    jsonObject.put("TLS.sig", (Object)sigTLS);
			    jsonObject.put("TLS.time", (Object)time);
			    jsonString = jsonObject.toString();
			    
			    //compression
			    Deflater compresser = new Deflater();
			    compresser.setInput(jsonString.getBytes(Charset.forName("UTF-8")));

			    compresser.finish();
			    byte [] compressBytes = new byte [512];
			    int compressBytesLength = compresser.deflate(compressBytes);
			    compresser.end();
			    return new String(Base64Url.base64EncodeUrl(Arrays.copyOfRange(compressBytes,0,compressBytesLength)));
		}catch (Exception e) {
			throw new  QCloudException(e);
		}
	}

	@Override
	public boolean verifyUserSig(String identifier, String sig)throws QCloudException {
		try {
			Security.addProvider(new BouncyCastleProvider());
			
			//DeBaseUrl64 urlSig to json
			Base64 decoder = new Base64();

			byte [] compressBytes = Base64Url.base64DecodeUrl(sig.getBytes(Charset.forName("UTF-8")));
			
			//Decompression
			Inflater decompression =  new Inflater();
			decompression.setInput(compressBytes, 0, compressBytes.length);
			byte [] decompressBytes = new byte [1024];
			int decompressLength = decompression.inflate(decompressBytes);
			decompression.end();
			
			String jsonString = new String(Arrays.copyOfRange(decompressBytes, 0, decompressLength));
			
			//Get TLS.Sig from json
			JSONObject jsonObject= JSON.parseObject(jsonString);
			String sigTLS = jsonObject.getString("TLS.sig");
			
			//debase64 TLS.Sig to get serailString
			byte[] signatureBytes = decoder.decode(sigTLS.getBytes(Charset.forName("UTF-8")));
			
			String strSdkAppid = jsonObject.getString("TLS.sdk_appid");
			String sigTime = jsonObject.getString("TLS.time");
			String sigExpire = jsonObject.getString("TLS.expire_after");
			
			if (!imConfig.getSdkAppId().equals(strSdkAppid))
			{
				return false;
			}

			if ( System.currentTimeMillis()/1000 - Long.parseLong(sigTime) > Long.parseLong(sigExpire)) {
				return false;
			}
			
			//Get Serial String from json
			String SerialString = 
				"TLS.appid_at_3rd:" + 0 + "\n" +
				"TLS.account_type:" + 0 + "\n" +
				"TLS.identifier:" + identifier + "\n" + 
				"TLS.sdk_appid:" + imConfig.getSdkAppId() + "\n" + 
				"TLS.time:" + sigTime + "\n" + 
				"TLS.expire_after:" + sigExpire + "\n";
		
	        Reader reader = new CharArrayReader(imConfig.getPublicKey().toCharArray());
	        PEMParser  parser = new PEMParser(reader);
	        JcaPEMKeyConverter converter = new JcaPEMKeyConverter();
	        Object obj = parser.readObject();
	        parser.close();
	        PublicKey pubKeyStruct  = converter.getPublicKey((SubjectPublicKeyInfo) obj);

			Signature signature = Signature.getInstance("SHA256withECDSA","BC");
			signature.initVerify(pubKeyStruct);
			signature.update(SerialString.getBytes(Charset.forName("UTF-8")));
			return signature.verify(signatureBytes);
		}catch (Exception e) {
			throw new QCloudException(e);
		}
	}
	
	@Override
	public MixStreamResponse mixStream(MixStreamDO streamDO) {
		long timestamp = System.currentTimeMillis()/1000;
		
		MixStreamBody body = new MixStreamBody();
		Interface _interface = body.new Interface();
		streamDO.setAppId(liveConfig.getSdkAppId());
		_interface.setPara(streamDO);
		body.set_interface(_interface);
		body.setEventId(timestamp);
		body.setTimestamp(timestamp);
		
		String sign = DigestUtils.md5Hex(liveConfig.getKey()+timestamp);
		
		String url = MIX_STREAM_URL+"?appid="+liveConfig.getSdkAppId()+"&interface=Mix_Stream&t="+timestamp+"&sign="+sign;
		String res = HttpClientUtil.post(url, JSON.toJSONString(body));
		try {
			JSONObject jsonObject = JSON.parseObject(res);
			MixStreamResponse response = new MixStreamResponse(jsonObject.getIntValue("code"));
			response.setMessage(jsonObject.getString("message"));
			response.setTimestamp(jsonObject.getLongValue("timestamp"));
			return response;
		} catch (Exception e) {
			MixStreamResponse response = new MixStreamResponse(100);
			response.setMessage(res);
			return response;
		}
	}
	
	public void setImConfig(IMConfigDO imConfig) {
		this.imConfig = imConfig;
	}

	public void setLiveConfig(LiveConfigDO liveConfig) {
		this.liveConfig = liveConfig;
	}
	
}
