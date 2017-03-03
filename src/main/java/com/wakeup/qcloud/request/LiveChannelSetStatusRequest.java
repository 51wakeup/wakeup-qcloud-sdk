package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.QCloudLiveResponse;

/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class LiveChannelSetStatusRequest extends AbstractQCloudLiveRequest<QCloudLiveResponse>{

	private static final long serialVersionUID = 7845786748608503799L;
	/**
	 * 直播码
	 */
	private String streamId;
	/**
	 * 开关状态,0:关闭； 1:开启
	 */
	private int status;
	
	@Override
	public Class<QCloudLiveResponse> getResponseClass() {
		return QCloudLiveResponse.class;
	}

	@Override
	public String getInterface() {
		return "Live_Channel_SetStatus";
	}

	@Override
	public Map<String, Object> getBizParamsMap() {
		Map<String, Object> map = newHashMap();
		map.put("Param.s.channel_id", streamId);
		map.put("Param.n.status", status);
		return map;
	}
	
}
