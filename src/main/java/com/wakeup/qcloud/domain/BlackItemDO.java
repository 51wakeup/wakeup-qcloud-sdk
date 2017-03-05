package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class BlackItemDO extends BaseDO {

	private static final long serialVersionUID = -9175376880225604488L;
	/**
	 * 黑名单的Identifier。
	 */
	@JSONField(name = "Black_Account")
	private String blackAccount;
	/**
	 * 添加黑名单的时间。
	 */
	@JSONField(name = "BlackTimeStamp")
	private long blackTimeStamp;

	public String getBlackAccount() {
		return blackAccount;
	}

	public void setBlackAccount(String blackAccount) {
		this.blackAccount = blackAccount;
	}

	public long getBlackTimeStamp() {
		return blackTimeStamp;
	}

	public void setBlackTimeStamp(long blackTimeStamp) {
		this.blackTimeStamp = blackTimeStamp;
	}
}
