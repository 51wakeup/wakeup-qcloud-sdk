package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveMsgBaseDO extends BaseDO {

	private static final long serialVersionUID = -3517506304843415857L;
	/**
	 * 直播码,同stream_id
	 */
	@JSONField(name = "channel_id")
	private String channelId;
	/**
	 * 事件类型	目前可能值为： 0、1、100、200
	 */
	@JSONField(name = "event_type")
	private int eventType;
	/**
	 * 安全签名,sign = MD5(key + t) ：腾讯云把加密key 和 t
	 * 进行字符串拼接后，通过MD5计算得出sign值，并将其放在通知消息里
	 * ，您的后台服务器在收到通知消息后可以根据同样的算法确认sign是否正确，进而确认消息是否确实来自腾讯云后台。
	 */
	@JSONField(name = "sign")
	private String sign;
	/**
	 * 直播码,同channel_id
	 */
	@JSONField(name = "stream_id")
	private String streamId;
	/**
	 * t（过期时间） 来自腾讯云的消息通知的默认过期时间是10分钟，如果一条通知消息中的 t
	 * 值所指定的时间已经过期，则可以判定这条通知无效，进而可以防止网络重放攻击。t
	 * 的格式为十进制UNIX时间戳，即从1970年1月1日（UTC/GMT的午夜）开始所经过的秒数。
	 */
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
