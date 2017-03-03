package com.wakeup.qcloud.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月21日
 * @author kalman03
 */
public class GroupMemberDO extends BaseDO {

	private static final long serialVersionUID = -6073420875390376324L;
	/**
	 * 成员（必填）
	 */
	@JSONField(name = "Member_Account")
	private String memberAccount;
	/**
	 * 赋予该成员的身份，目前备选项只有Admin（选填）
	 */
	@JSONField(name = "Role")
	private String role;
	/**
	 * 群成员维度自定义字段（选填）
	 */
	@JSONField(name = "AppMemberDefinedData")
	private List<AppDefinedDataDO> appMemberDefinedData;
	/**
	 * 入群时间（UTC时间）
	 */
	@JSONField(name = "JoinTime")
	private long joinTime;

	@JSONField(name = "MsgSeq")
	private long msgSeq;
	/**
	 * 消息屏蔽选项
	 */
	@JSONField(name = "MsgFlag")
	private String msgFlag;
	/**
	 * 最后发言时间（UTC时间）
	 */
	@JSONField(name = "LastSendMsgTime")
	private long lastSendMsgTime;
	/**
	 * 禁言截至时间（UTC时间）
	 */
	@JSONField(name = "ShutUpUntil")
	private long shutUpUntil;

	public String getMemberAccount() {
		return memberAccount;
	}

	public void setMemberAccount(String memberAccount) {
		this.memberAccount = memberAccount;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<AppDefinedDataDO> getAppMemberDefinedData() {
		return appMemberDefinedData;
	}

	public void setAppMemberDefinedData(
			List<AppDefinedDataDO> appMemberDefinedData) {
		this.appMemberDefinedData = appMemberDefinedData;
	}

	public long getJoinTime() {
		return joinTime;
	}

	public void setJoinTime(long joinTime) {
		this.joinTime = joinTime;
	}

	public long getMsgSeq() {
		return msgSeq;
	}

	public void setMsgSeq(long msgSeq) {
		this.msgSeq = msgSeq;
	}

	public String getMsgFlag() {
		return msgFlag;
	}

	public void setMsgFlag(String msgFlag) {
		this.msgFlag = msgFlag;
	}

	public long getLastSendMsgTime() {
		return lastSendMsgTime;
	}

	public void setLastSendMsgTime(long lastSendMsgTime) {
		this.lastSendMsgTime = lastSendMsgTime;
	}

	public long getShutUpUntil() {
		return shutUpUntil;
	}

	public void setShutUpUntil(long shutUpUntil) {
		this.shutUpUntil = shutUpUntil;
	}
}
