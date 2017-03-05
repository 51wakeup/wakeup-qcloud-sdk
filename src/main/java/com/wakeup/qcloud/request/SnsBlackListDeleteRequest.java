package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.response.SnsFriendResponse;

/**
 * 删除黑名单 https://www.qcloud.com/document/product/269/3719
 * 
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsBlackListDeleteRequest extends
		AbstractQCloudIMRequest<SnsFriendResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 必填 需要为该Identifier删除黑名单。
	 */
	private String fromAccount;
	/**
	 * 必填 将要删除的黑名单的Identifier。
	 */
	private List<String> toAccounts;

	@Override
	public String getApiName() {
		return "sns/black_list_delete";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("From_Account", fromAccount);
		map.put("To_Account", toAccounts);
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

	public List<String> getToAccounts() {
		return toAccounts;
	}

	public void setToAccounts(List<String> toAccounts) {
		this.toAccounts = toAccounts;
	}
}
