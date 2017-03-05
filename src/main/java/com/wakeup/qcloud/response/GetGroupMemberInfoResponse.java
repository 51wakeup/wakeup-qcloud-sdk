package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.GroupMemberDO;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class GetGroupMemberInfoResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	/**
	 * 本群组的群成员总数
	 */
	@JSONField(name = "MemberNum")
	private int memberNum;
	/**
	 * 群成员列表
	 */
	@JSONField(name = "MemberList")
	private List<GroupMemberDO> memberList;

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public List<GroupMemberDO> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<GroupMemberDO> memberList) {
		this.memberList = memberList;
	}

}
