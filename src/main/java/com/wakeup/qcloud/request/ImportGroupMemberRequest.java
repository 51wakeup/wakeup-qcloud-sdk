package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.response.AddGroupMemberResponse;

/**
 * 导入群成员 https://www.qcloud.com/document/product/269/1636
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class ImportGroupMemberRequest extends
		AbstractQCloudIMRequest<AddGroupMemberResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private String groupId;

	private List<Member> memberList;

	public static class Member {
		@JSONField(name = "Member_Account")
		private String memberAccount;
		@JSONField(name = "Role")
		private String role;
		@JSONField(name = "JoinTime")
		private Long joinTime;
		@JSONField(name = "UnreadMsgNum")
		private Integer unreadMsgNum;

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

		public Long getJoinTime() {
			return joinTime;
		}

		public void setJoinTime(Long joinTime) {
			this.joinTime = joinTime;
		}

		public Integer getUnreadMsgNum() {
			return unreadMsgNum;
		}

		public void setUnreadMsgNum(Integer unreadMsgNum) {
			this.unreadMsgNum = unreadMsgNum;
		}
	}

	@Override
	public String getApiName() {
		return "group_open_http_svc/import_group_member";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("MemberList", memberList);
		return map;
	}

	@Override
	public Class<AddGroupMemberResponse> getResponseClass() {
		return AddGroupMemberResponse.class;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<Member> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}
}
