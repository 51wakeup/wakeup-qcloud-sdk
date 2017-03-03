package com.wakeup.qcloud.request;

import com.wakeup.qcloud.QCloudRequest;
import com.wakeup.qcloud.QCloudBiz;
import com.wakeup.qcloud.RequestMethod;
import com.wakeup.qcloud.domain.BaseDO;
import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public abstract class AbstractQCloudIMRequest<T extends QCloudIMResponse> extends BaseDO implements QCloudRequest<T> {
	
	private static final long serialVersionUID = -6298257514113902365L;
	private final static String IM_REST_API_BASE_URL = "https://console.tim.qq.com/";
	
	public abstract String getApiName();
	
	public String getApiVersion() {
		return "v4";
	}
	
	public String getRestApiUrl(){
		return IM_REST_API_BASE_URL;
	}

	@Override
	public RequestMethod getRequestMethod() {
		return RequestMethod.POST;
	}

	@Override
	public QCloudBiz getService() {
		return QCloudBiz.TIM;
	}

	@Override
	public String getRequestUrl() {
		StringBuilder builder = new StringBuilder(getRestApiUrl());
		builder.append(getApiVersion()).append("/")
		.append(getApiName());
		return builder.toString();
	}
}
