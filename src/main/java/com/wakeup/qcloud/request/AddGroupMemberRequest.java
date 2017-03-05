package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.response.AddGroupMemberResponse;

/**
 * 增加群组成员
 * https://www.qcloud.com/document/product/269/1621
 * @since 2017年3月5日
 * @author kalman03
 */
public class AddGroupMemberRequest extends
		AbstractQCloudIMRequest<AddGroupMemberResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private String groupId;
	/**
	 * 必填	待添加的群成员数组。
	 */
	private List<GroupMember> memberList;
	/**
	 * 选填	是否静默加人。0：非静默加人；1：静默加人。不填该字段默认为0。
	 */
	private int silence = 0 ;

	public static class GroupMember{
		@JSONField(name="Member_Account")
		private String memberAccount;

		public String getMemberAccount() {
			return memberAccount;
		}

		public void setMemberAccount(String memberAccount) {
			this.memberAccount = memberAccount;
		}
	}
	
	@Override
	public String getApiName() {
		return "group_open_http_svc/add_group_member";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("Silence", silence);
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

	public List<GroupMember> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<GroupMember> memberList) {
		this.memberList = memberList;
	}
}
