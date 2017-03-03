package com.wakeup.qcloud.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class GroupInfoDO extends GroupIdDO {

	private static final long serialVersionUID = 3676444447247303267L;
	/**
	 * 针对该群组的返回结果
	 */
	@JSONField(name = "ErrorCode")
	private int errorCode;
	/**
	 * 针对该群组的返回结果
	 */
	@JSONField(name = "ErrorInfo")
	private String errorInfo;
	/**
	 * {@link GroupType} 群组类型
	 */
	@JSONField(name = "Type")
	private String type;
	/**
	 * 群组名称
	 */
	@JSONField(name = "Name")
	private String name;
	/**
	 * 群组简介
	 */
	@JSONField(name = "Introduction")
	private String introduction;
	/**
	 * 群组通知
	 */
	@JSONField(name = "Notification")
	private String notification;
	/**
	 * 群组头像
	 */
	@JSONField(name="FaceUrl")
	private String faceUrl;
	/**
	 *  群主ID
	 */
	@JSONField(name="Owner_Account")
	private String ownerAccount;
	/**
	 * 群组创建时间（UTC时间）
	 */
	@JSONField(name="CreateTime")
	private long createTime;
	/**
	 * 最后群资料变更时间（UTC时间）
	 */
	@JSONField(name="LastInfoTime")
	private long lastInfoTime;
	
	/**
	 *群内最后一条消息的时间（UTC时间）
	 */
	@JSONField(name="LastMsgTime")
	private long lastMsgTime;
	
	@JSONField(name="NextMsgSeq")
	private long nextMsgSeq;
	/**
	 *  当前群成员数量
	 */
	@JSONField(name="MemberNum")
	private long memberNum;
	/**
	 * 最大群成员数量
	 */
	@JSONField(name="MaxMemberNum")
	private long maxMemberNum;
	
	/**
	 * {@link ApplyJoinOption} 申请加群处理方式
	 */
	@JSONField(name="ApplyJoinOption")
	private String applyJoinOption;
	/**
	 * 群组维度的自定义字段
	 */
	@JSONField(name = "AppDefinedData")
	private List<AppDefinedDataDO> appDefinedDataDO;
	/**
	 * 群成员列表
	 */
	@JSONField(name = "MemberList")
	private List<GroupMemberDO> memberList;

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	public List<AppDefinedDataDO> getAppDefinedDataDO() {
		return appDefinedDataDO;
	}

	public void setAppDefinedDataDO(List<AppDefinedDataDO> appDefinedDataDO) {
		this.appDefinedDataDO = appDefinedDataDO;
	}

	public List<GroupMemberDO> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<GroupMemberDO> memberList) {
		this.memberList = memberList;
	}

	public String getFaceUrl() {
		return faceUrl;
	}

	public void setFaceUrl(String faceUrl) {
		this.faceUrl = faceUrl;
	}

	public String getOwnerAccount() {
		return ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public long getLastInfoTime() {
		return lastInfoTime;
	}

	public void setLastInfoTime(long lastInfoTime) {
		this.lastInfoTime = lastInfoTime;
	}

	public long getLastMsgTime() {
		return lastMsgTime;
	}

	public void setLastMsgTime(long lastMsgTime) {
		this.lastMsgTime = lastMsgTime;
	}

	public long getNextMsgSeq() {
		return nextMsgSeq;
	}

	public void setNextMsgSeq(long nextMsgSeq) {
		this.nextMsgSeq = nextMsgSeq;
	}

	public long getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(long memberNum) {
		this.memberNum = memberNum;
	}

	public long getMaxMemberNum() {
		return maxMemberNum;
	}

	public void setMaxMemberNum(long maxMemberNum) {
		this.maxMemberNum = maxMemberNum;
	}

	public String getApplyJoinOption() {
		return applyJoinOption;
	}

	public void setApplyJoinOption(String applyJoinOption) {
		this.applyJoinOption = applyJoinOption;
	}

}
