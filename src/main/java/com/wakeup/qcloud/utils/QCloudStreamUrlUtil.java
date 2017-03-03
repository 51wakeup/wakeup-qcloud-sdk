package com.wakeup.qcloud.utils;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import org.apache.commons.codec.digest.DigestUtils;

import com.google.common.base.Throwables;
import com.wakeup.qcloud.domain.StreamDataType;
import com.wakeup.qcloud.domain.StreamPlayUrlDO;
import com.wakeup.qcloud.domain.StreamUrlConfig;

/**
 * @since 2017年2月22日
 * @author kalman03
 */
public class QCloudStreamUrlUtil {
	/**
	 * <pre>
	 * 直播码计算规则:

直播码=BIZID_MD5(房间号_用户名_数据类型)。
字符串传输按utf-8编码。摄像头数据类型是main，屏幕分享的数据类型是aux。而BIZID是一个固定的参数，可以在直播控制台的顶部找到它。
假如BIZID=8888,用户名=14y2l2c，房间号=293710，在进行摄像头分享，
则MD5(293710_14y2l2c_main)=81265058829fd2e50c8ec2ac78d55127。
那么直播码就是8888_81265058829fd2e50c8ec2ac78d55127。
	</pre>
	 * @param bizId 您在腾讯云分配到的bizid
	 * @param roomId 房间号
	 * @param userId 主播id
	 * @param dataType 摄像头数据类型是main，屏幕分享的数据类型是aux
	 */
	public static String getStreamId(String bizId,String roomId,String userId,StreamDataType dataType){
		String org= roomId+"_"+userId+"_"+dataType.name();
		return bizId +"_"+DigestUtils.md5Hex(org);
	}

	/**
	 * 获取推流地址 如果不传key和过期时间，将返回不含防盗链的url
	 */
	public static String getPushUrl(StreamUrlConfig config) {
		String liveCode = getStreamId(config.getBizId(), config.getRoomId(), config.getUserId(), config.getDataType());
		if(isNotBlank(config.getKey()) && config.getExpireTime() != null){
			String txTime = Long.toHexString(config.getExpireTime().getTime()/1000).toUpperCase();
			String input = new StringBuilder().append(config.getKey()).append(liveCode)
					.append(txTime).toString();
			try {
				String txSecret = DigestUtils.md5Hex(input.getBytes("UTF-8"));
				return "rtmp://"+config.getBizId()+".livepush.myqcloud.com/live/"+liveCode+"?bizid="+config.getBizId()+"&txSecret="+txSecret+"&txTime="+txTime;
			} catch (Exception e) {
				Throwables.propagate(e);
			}
		}
		return "rtmp://"+config.getBizId()+".livepush.myqcloud.com/live/"+liveCode;
	}
	
	/**
	 * 获取播放地址
	 * @param streamId 
	 */
	public static StreamPlayUrlDO getPlayUrls(String streamId) {
		String bizId = streamId.substring(0,streamId.indexOf("_"));
		StreamPlayUrlDO playUrlDO = new StreamPlayUrlDO();
		playUrlDO.setFlvPlayUrl("http://" + bizId + ".liveplay.myqcloud.com/live/" + streamId + ".flv");
		playUrlDO.setHlsPlayUrl("http://" + bizId + ".liveplay.myqcloud.com/live/" + streamId + ".m3u8");
		playUrlDO.setRtmpPlayUrl("rtmp://" + bizId + ".liveplay.myqcloud.com/live/" + streamId);
		return playUrlDO;
	}
}
