package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.response.GetJoinedGroupListResponse;

/**
 * 获取用户所加入的群组 https://www.qcloud.com/document/product/269/1625
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class GetJoinedGroupListRequest extends
		AbstractQCloudIMRequest<GetJoinedGroupListResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private String memberAccount;
	/**
	 * 选填 分别包含GroupBaseInfoFilter和SelfInfoFilter两个过滤器；
	 */
	private ResponseFilter responseFilter;
	/**
	 * {@link com.wakeup.qcloud.constant.GroupType} 选填
	 * 拉取哪种群组形态，例如Private，Public，ChatRoom或AVChatRoom，不填为拉取所有。
	 */
	private String groupType;
	/**
	 * 单次拉取的群组数量，如果不填代表所有群组，分页方式与获取APP中的所有群组相同。
	 */
	private Integer limit;
	/**
	 * 从第多少个群组开始拉取，分页方式与获取APP中的所有群组相同。
	 */
	private Integer offset;

	@Override
	public String getApiName() {
		return "group_open_http_svc/get_joined_group_list";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("Member_Account", memberAccount);
		map.put("Limit", limit);
		map.put("Offset", offset);
		map.put("GroupType", groupType);
		map.put("ResponseFilter", responseFilter);
		return map;
	}

	@Override
	public Class<GetJoinedGroupListResponse> getResponseClass() {
		return GetJoinedGroupListResponse.class;
	}

	public static class ResponseFilter {
		/**
		 * GroupBaseInfoFilter表示需要拉取哪些基础信息字段，具体参见群基础资料
		 */
		@JSONField(name = "GroupBaseInfoFilter")
		private Set<String> groupBaseInfoFilter;
		/**
		 * SelfInfoFilter表示需要拉取用户在每个群组中的哪些个人资料，具体请参见群成员资料。
		 */
		@JSONField(name = "SelfInfoFilter")
		private Set<String> selfInfoFilter;

		public Set<String> getGroupBaseInfoFilter() {
			return groupBaseInfoFilter;
		}

		public void setGroupBaseInfoFilter(Set<String> groupBaseInfoFilter) {
			this.groupBaseInfoFilter = groupBaseInfoFilter;
		}

		public Set<String> getSelfInfoFilter() {
			return selfInfoFilter;
		}

		public void setSelfInfoFilter(Set<String> selfInfoFilter) {
			this.selfInfoFilter = selfInfoFilter;
		}
	}
}
