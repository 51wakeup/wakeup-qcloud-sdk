package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.wakeup.qcloud.response.GetGroupMemberInfoResponse;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class GetGroupMemberInfoRequest extends
		AbstractQCloudIMRequest<GetGroupMemberInfoResponse> {

	private static final long serialVersionUID = 9197076482321160595L;
	/**
	 * 需要拉取的群组列表。必填
	 */
	private String groupId;
	/**
	 * 需要获取哪些信息， 如果没有该字段则为群成员全部资料，成员信息字段详情参见：群成员资料。
	 */
	private Set<String> memberInfoFilter;
	/**
	 * 拉取指定身份的群成员资料。如没有填写该字段，默认为所有身份成员资料，成员身份可以为：“Owner”，“Admin”，“Member”。
	 */
	private Set<String> memberRoleFilter;
	/**
	 * 该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段。
	 */
	private Set<String> appDefinedDataFilterGroupMember;
	/**
	 * 一次最多获取多少个成员的资料，不得超过10000。如果不填，则获取群内全部成员的信息
	 */
	private Integer limit;
	/**
	 * 从第几个成员开始获取，如果不填则默认为0，表示从第一个成员开始获取。
	 */
	private int offset = 0;

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("MemberInfoFilter", memberInfoFilter);
		map.put("MemberRoleFilter", memberRoleFilter);
		map.put("AppDefinedDataFilter_GroupMember",
				appDefinedDataFilterGroupMember);
		map.put("Limit", limit);
		map.put("Offset", offset);
		return map;
	}

	@Override
	public Class<GetGroupMemberInfoResponse> getResponseClass() {
		return GetGroupMemberInfoResponse.class;
	}

	@Override
	public String getApiName() {
		return "group_open_http_svc/get_group_member_info";
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Set<String> getMemberInfoFilter() {
		return memberInfoFilter;
	}

	public void setMemberInfoFilter(Set<String> memberInfoFilter) {
		this.memberInfoFilter = memberInfoFilter;
	}

	public Set<String> getMemberRoleFilter() {
		return memberRoleFilter;
	}

	public void setMemberRoleFilter(Set<String> memberRoleFilter) {
		this.memberRoleFilter = memberRoleFilter;
	}

	public Set<String> getAppDefinedDataFilterGroupMember() {
		return appDefinedDataFilterGroupMember;
	}

	public void setAppDefinedDataFilterGroupMember(
			Set<String> appDefinedDataFilterGroupMember) {
		this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

}
