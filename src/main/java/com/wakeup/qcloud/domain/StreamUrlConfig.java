package com.wakeup.qcloud.domain;

import java.util.Date;

/**
 * @since 2017年3月3日
 * @author kalman03
 */
public class StreamUrlConfig {

	/**
	 *  您在腾讯云分配到的bizid，必须
	 */
	private String bizId;
	/**
	 * 房间号，必须
	 */
	private String roomId;
	/**
	 * 用户名，必须
	 */
	private String userId;
	/**
	 * 数据源类型，必须
	 */
	private StreamDataType dataType;
	/**
	 * 安全密钥，可选
	 */
	private String key;
	/**
	 * 过期时间，可选
	 */
	private Date expireTime;

	public String getBizId() {
		return bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public StreamDataType getDataType() {
		return dataType;
	}

	public void setDataType(StreamDataType dataType) {
		this.dataType = dataType;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
}
