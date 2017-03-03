package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月21日
 * @author kalman03
 */
public class SendMsgResultDO extends BaseDO {

	private static final long serialVersionUID = 6604622902510726136L;
	@JSONField(name = "To_Account")
	private String toAccount;
	@JSONField(name = "ErrorCode")
	private long errorCode;

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public long getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(long errorCode) {
		this.errorCode = errorCode;
	}

}
