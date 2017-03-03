package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月27日
 * @author kalman03
 */
public class SoundMsgContentDO extends IMMsgContentDO {

	private static final long serialVersionUID = 843819404065657793L;

	@Override
	public String getMsgType() {
		return IMMsgType.TIMSoundElem;
	}

	@JSONField(name = "UUID")
	private String uuid;
	@JSONField(name = "Size")
	private long size;
	@JSONField(name = "Second")
	private long second;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}

}
