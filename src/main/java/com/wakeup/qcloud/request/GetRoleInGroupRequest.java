package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.wakeup.qcloud.response.GetRoleInGroupResponse;

/**
 * 查询用户在群组中的身份 https://www.qcloud.com/document/product/269/1626
 * 
 * @since 2017年3月5日
 * @author kalman03O
 */
public class GetRoleInGroupRequest extends
		AbstractQCloudIMRequest<GetRoleInGroupResponse> {

	private static final long serialVersionUID = 9197076482321160595L;
	/**
	 * 必填 需要查询的群组ID。
	 */
	private String groupId;
	/**
	 * 必填 表示需要查询的用户账号，最多支持500个账号。
	 */
	private Set<String> userAccounts;

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("User_Account", userAccounts);
		return map;
	}

	@Override
	public Class<GetRoleInGroupResponse> getResponseClass() {
		return GetRoleInGroupResponse.class;
	}

	@Override
	public String getApiName() {
		return "group_open_http_svc/get_role_in_group";
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Set<String> getUserAccounts() {
		return userAccounts;
	}

	public void setUserAccounts(Set<String> userAccounts) {
		this.userAccounts = userAccounts;
	}

}
