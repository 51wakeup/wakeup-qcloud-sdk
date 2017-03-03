package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.response.IMGetGroupInfoResponse;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class IMGetGroupInfoRequest extends AbstractQCloudIMRequest<IMGetGroupInfoResponse> {

	private static final long serialVersionUID = 9197076482321160595L;
	/**
	 * 需要拉取的群组列表。必填
	 */
	private Set<String> groupIds;
	/**
	 * GroupBaseInfoFilter，MemberInfoFilter，AppDefinedDataFilter_Group，
	 * 分别是基础信息字段过滤器，成员信息字段过滤器，群组维度的自定义字段过滤器。
	 */
	private ResponseFilter responseFilter;

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupIdList", groupIds);
		if (responseFilter != null)
			map.put("ResponseFilter", responseFilter);
		return map;
	}

	@Override
	public Class<IMGetGroupInfoResponse> getResponseClass() {
		return IMGetGroupInfoResponse.class;
	}

	@Override
	public String getApiName() {
		return "group_open_http_svc/get_group_info";
	}

	public static class ResponseFilter {
		/**
		 * 基础信息字段过滤器，指定需要获取的基础信息字段，基础信息字段详情参见：群基础资料。
		 */
		@JSONField(name="GroupBaseInfoFilter")
		private Set<String> groupBaseInfoFilter;
		/**
		 * 成员信息字段过滤器，指定需要获取的成员信息字段，成员信息字段详情参见：群成员资料。
		 */
		@JSONField(name="MemberInfoFilter")
		private Set<String> memberInfoFilter;
		/**
		 * 该字段用来群组维度的自定义字段过滤器，指定需要获取的群组维度的自定义字段。
		 */
		@JSONField(name="AppDefinedDataFilter_Group")
		private Set<String> appDefinedDataFilterGroup;
		/**
		 * 该字段用来群成员维度的自定义字段过滤器，指定需要获取的群成员维度的自定义字段。
		 */
		@JSONField(name="AppDefinedDataFilter_GroupMember")
		private Set<String> appDefinedDataFilterGroupMember;

		public Set<String> getGroupBaseInfoFilter() {
			return groupBaseInfoFilter;
		}

		public void setGroupBaseInfoFilter(Set<String> groupBaseInfoFilter) {
			this.groupBaseInfoFilter = groupBaseInfoFilter;
		}

		public Set<String> getMemberInfoFilter() {
			return memberInfoFilter;
		}

		public void setMemberInfoFilter(Set<String> memberInfoFilter) {
			this.memberInfoFilter = memberInfoFilter;
		}

		public Set<String> getAppDefinedDataFilterGroup() {
			return appDefinedDataFilterGroup;
		}

		public void setAppDefinedDataFilterGroup(
				Set<String> appDefinedDataFilterGroup) {
			this.appDefinedDataFilterGroup = appDefinedDataFilterGroup;
		}

		public Set<String> getAppDefinedDataFilterGroupMember() {
			return appDefinedDataFilterGroupMember;
		}

		public void setAppDefinedDataFilterGroupMember(
				Set<String> appDefinedDataFilterGroupMember) {
			this.appDefinedDataFilterGroupMember = appDefinedDataFilterGroupMember;
		}
	}

	public Set<String> getGroupIds() {
		return groupIds;
	}

	public void setGroupIds(Set<String> groupIds) {
		this.groupIds = groupIds;
	}

	public ResponseFilter getResponseFilter() {
		return responseFilter;
	}

	public void setResponseFilter(ResponseFilter responseFilter) {
		this.responseFilter = responseFilter;
	}
}
