package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.LiveChannelGetStatusResponse;

/**
 * <pre>
 * 接口

Live_Channel_GetStatus：用于查询某条流是否处于正在直播的状态
地址

API调用地址为： http://fcgi.video.qcloud.com/common_access
用途

用于查询某条流是否处于正在直播的状态，其内部原理是基于腾讯云对音视频流的中断检测而实现的，因此实时性上可能不如APP的主动上报这么快速和准确，但在进行直播流定时清理检查的时候，可以作为一种不错的补充手段。
说明

如果要查询的推流直播码从来没有推过流，会返回20601错误码。
 * </pre>
 * @since 2017年2月23日
 * @author kalman03
 */
public class LiveChannelGetStatusRequest extends AbstractQCloudLiveRequest<LiveChannelGetStatusResponse>{

	private static final long serialVersionUID = 1813908816782564320L;

	/**
	 * 直播码,一次只能查询一条直播流
	 */
	private String streamId;
	
	@Override
	public Class<LiveChannelGetStatusResponse> getResponseClass() {
		return LiveChannelGetStatusResponse.class;
	}

	@Override
	public String getInterface() {
		return "Live_Channel_GetStatus";
	}

	@Override
	public Map<String, Object> getBizParamsMap() {
		Map<String, Object> map = newHashMap();
		map.put("Param.s.channel_id", streamId);
		return map;
	}

	public String getStreamId() {
		return streamId;
	}

	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}
}
