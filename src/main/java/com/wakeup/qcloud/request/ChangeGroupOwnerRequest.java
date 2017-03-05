package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 转让群组 https://www.qcloud.com/document/product/269/1633
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class ChangeGroupOwnerRequest extends
		AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 必填 要被转移的群组ID。
	 */
	private String groupId;
	/**
	 * 必填 新群主ID。
	 */
	private String newOwnerAccount;

	@Override
	public String getApiName() {
		return "group_open_http_svc/change_group_owner";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("NewOwner_Account", newOwnerAccount);
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

	public String getNewOwnerAccount() {
		return newOwnerAccount;
	}

	public void setNewOwnerAccount(String newOwnerAccount) {
		this.newOwnerAccount = newOwnerAccount;
	}

}
