package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.QCloudRequest;
import com.wakeup.qcloud.QCloudBiz;
import com.wakeup.qcloud.RequestMethod;
import com.wakeup.qcloud.domain.BaseDO;
import com.wakeup.qcloud.response.QCloudLiveResponse;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public abstract class AbstractQCloudLiveRequest<T extends QCloudLiveResponse> extends BaseDO implements QCloudRequest<T> {
	
	private static final long serialVersionUID = -6298257514113902365L;
	
	private final static String LIVE_API_BASE_URL = "http://fcgi.video.qcloud.com/common_access";
	
	public abstract String getInterface();
	/**
	 * 业务参数
	 */
	public abstract Map<String, Object> getBizParamsMap();
	
	
	public String getRestApiUrl(){
		return LIVE_API_BASE_URL;
	}

	@Override
	public RequestMethod getRequestMethod() {
		return RequestMethod.POST;
	}

	@Override
	public QCloudBiz getService() {
		return QCloudBiz.LIVE;
	}

	@Override
	public String getRequestUrl() {
		return getRestApiUrl();
	}

	@Override
	public final Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("interface", getInterface());
		map.putAll(getBizParamsMap());
		return map;
	}
}
