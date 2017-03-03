package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *  地理位置消息元素
 * @since 2017年2月20日
 * @author kalman03
 */
public class LocationMsgContentDO extends IMMsgContentDO {

	private static final long serialVersionUID = -4473750917656847149L;
	/**
	 * 地理位置描述信息。
	 */
	@JSONField(name = "Desc")
	private String desc;
	/**
	 * 纬度
	 */
	@JSONField(name = "Latitude")
	private float latitude;
	/**
	 * 经度
	 */
	@JSONField(name = "Longitude")
	private float longitude;

	@Override
	public String getMsgType() {
		return IMMsgType.TIMLocationElem;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
}
