package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveMsgBaseDO extends BaseDO {

	private static final long serialVersionUID = -3517506304843415857L;
	@JSONField(name = "channel_id")
	private String channelId;
	@JSONField(name = "event_type")
	private int eventType;
	@JSONField(name = "sign")
	private String sign;
	@JSONField(name = "stream_id")
	private String streamId;
	@JSONField(name = "t")
	private long t;

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getStreamId() {
		return streamId;
	}

	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}

	public long getT() {
		return t;
	}

	public void setT(long t) {
		this.t = t;
	}
}
