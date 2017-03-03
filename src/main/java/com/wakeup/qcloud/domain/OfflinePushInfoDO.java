package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月21日
 * @author kalman03
 */
public class OfflinePushInfoDO extends BaseDO {

	private static final long serialVersionUID = -1799510768663966198L;
	/**
	 * 0表示推送，1表示不离线推送。
	 */
	@JSONField(name = "PushFlag")
	private int pushFlag;
	/**
	 * 离线推送内容 。
	 */
	@JSONField(name = "Desc")
	private String desc;
	/**
	 * 离线推送透传内容。
	 */
	@JSONField(name = "Ext")
	private String ext;
	/**
	 * 离线推送声音文件路径。
	 */
	@JSONField(name = "Sound")
	private String sound;

	public int getPushFlag() {
		return pushFlag;
	}

	public void setPushFlag(int pushFlag) {
		this.pushFlag = pushFlag;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}
}
