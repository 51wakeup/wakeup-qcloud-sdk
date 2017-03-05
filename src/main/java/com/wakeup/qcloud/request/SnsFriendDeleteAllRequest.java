package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.SnsFriendResponse;

/**
 * 删除所有好友 https://www.qcloud.com/document/product/269/1645
 * 
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsFriendDeleteAllRequest extends AbstractQCloudIMRequest<SnsFriendResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 必填 需要为该Identifier删除好友。
	 */
	private String fromAccount;

	@Override
	public String getApiName() {
		return "sns/friend_delete_all";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("From_Account", fromAccount);
		return map;
	}

	@Override
	public Class<SnsFriendResponse> getResponseClass() {
		return SnsFriendResponse.class;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
}
