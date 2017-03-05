package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.MemberResultDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class AddGroupMemberResponse extends QCloudIMResponse{

	private static final long serialVersionUID = 1095980905089249771L;
	
	@JSONField(name="MemberList")
	private List<MemberResultDO> memberList;

	public List<MemberResultDO> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<MemberResultDO> memberList) {
		this.memberList = memberList;
	}
	

}
