package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 批量禁言和取消禁言 https://www.qcloud.com/document/product/269/1627
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class ForbidSendMsgRequest extends
		AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private String groupId;
	/**
	 * 必填 需要禁言的用户账号，最多支持500个账号。
	 */
	private Set<String> membersAccount;
	/**
	 * 必填 需禁言时间，单位为秒，为0时表示取消禁言。
	 */
	private Long ShutUpTime;

	@Override
	public String getApiName() {
		return "group_open_http_svc/forbid_send_msg";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("ShutUpTime", ShutUpTime);
		map.put("Members_Account", membersAccount);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Set<String> getMembersAccount() {
		return membersAccount;
	}

	public void setMembersAccount(Set<String> membersAccount) {
		this.membersAccount = membersAccount;
	}

	public Long getShutUpTime() {
		return ShutUpTime;
	}

	public void setShutUpTime(Long shutUpTime) {
		ShutUpTime = shutUpTime;
	}

}
