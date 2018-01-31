package com.wakeup.qcloud.listener.request;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;

/**
 * @since 2018年1月31日
 * @author kalman03
 */
public class GroupCallbackMembersNewOrExitReq extends BaseDO{


	private static final long serialVersionUID = 6117796048625309821L;
	private String callbackCommand;
	private String groupId;
	private String type;
	private String fromAccount;
	private String operatorAccount;
	private long random;
	
	private List<NewOrExitMember> newMemberList;
	private List<NewOrExitMember> exitMemberList;
	private String exitType;
	
	public static class NewOrExitMember extends BaseDO{
		private static final long serialVersionUID = 3580823619246411402L;
		@JSONField(name="Member_Account")
		private String memberAccount;

		public String getMemberAccount() {
			return memberAccount;
		}

		public void setMemberAccount(String memberAccount) {
			this.memberAccount = memberAccount;
		}
	}
	
	public String getCallbackCommand() {
		return callbackCommand;
	}
	public void setCallbackCommand(String callbackCommand) {
		this.callbackCommand = callbackCommand;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
	public String getOperatorAccount() {
		return operatorAccount;
	}
	public void setOperatorAccount(String operatorAccount) {
		this.operatorAccount = operatorAccount;
	}
	public long getRandom() {
		return random;
	}
	public void setRandom(long random) {
		this.random = random;
	}
	public List<NewOrExitMember> getNewMemberList() {
		return newMemberList;
	}
	public void setNewMemberList(List<NewOrExitMember> newMemberList) {
		this.newMemberList = newMemberList;
	}
	public List<NewOrExitMember> getExitMemberList() {
		return exitMemberList;
	}
	public void setExitMemberList(List<NewOrExitMember> exitMemberList) {
		this.exitMemberList = exitMemberList;
	}
	public String getExitType() {
		return exitType;
	}
	public void setExitType(String exitType) {
		this.exitType = exitType;
	}
}
