package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class IMStateDO extends BaseDO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 688615558837608403L;
	/**
	 * 返回的用户的Identifier。
	 */
	@JSONField(name = "To_Account")
	private String toAccount;
	/**
	 * 返回的用户状态，目前支持的状态有："Online"（和客户端有长连接）, "Offline"（长连接断开）。
	 */
	@JSONField(name = "State")
	private String state;

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
