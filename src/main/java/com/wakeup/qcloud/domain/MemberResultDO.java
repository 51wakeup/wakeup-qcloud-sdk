package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年3月5日
 * @author kalman03
 */
public class MemberResultDO extends BaseDO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 313609112307711108L;
	@JSONField(name="Member_Account")
	private String memberAccount;
	/**
	 * 加人结果：0-失败；1-成功；2-已经是群成员；3-等待被邀请者确认。
	 */
	@JSONField(name="Result")
	private int result;
	public String getMemberAccount() {
		return memberAccount;
	}
	public void setMemberAccount(String memberAccount) {
		this.memberAccount = memberAccount;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
}
