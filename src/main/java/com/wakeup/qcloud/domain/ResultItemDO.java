package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class ResultItemDO extends BaseDO {

	private static final long serialVersionUID = -7098929481805831516L;
	/**
	 * 请求添加的好友的Identifier。
	 */
	@JSONField(name = "To_Account")
	private String toAccount;
	/**
	 * 批量加好友中单个好友的处理结果，0表示业务成功，非0表示业务失败。
	 */
	@JSONField(name = "ResultCode")
	private int resultCode;
	@JSONField(name = "ResultInfo")
	private String resultInfo;

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(String resultInfo) {
		this.resultInfo = resultInfo;
	}
}
