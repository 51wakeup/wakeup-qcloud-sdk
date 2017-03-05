package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.response.SnsFriendResponse;

/**
 * 删除好友 https://www.qcloud.com/document/product/269/1644
 * 
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsFriendDeleteRequest extends
		AbstractQCloudIMRequest<SnsFriendResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 必填 需要为该Identifier删除好友。
	 */
	private String fromAccount;
	/**
	 * 必填 待删除的好友的Identifier。
	 */
	private List<String> toAccounts;
	/**
	 * <pre>
	 * 必填 删除模式，https://www.qcloud.com/document/product/269/1501#3.4-.E5.88.A0.E9.99.A4.E5.A5.BD.E5.8F.8B
	 * 单向删除好友	Delete_Type_Single	只将To_Account从From_Account的好友表中删除，但不会将From_Account从To_Account的好友表中删除
	 * 双向删除好友	Delete_Type_Both	将To_Account从From_Account的好友表中删除，同时将From_Account从To_Account的好友表中删除
	 *</pre>
	 */
	private String deleteType;

	@Override
	public String getApiName() {
		return "sns/friend_delete";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("From_Account", fromAccount);
		map.put("To_Account", toAccounts);
		map.put("DeleteType", deleteType);
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

	public String getDeleteType() {
		return deleteType;
	}

	public void setDeleteType(String deleteType) {
		this.deleteType = deleteType;
	}
}
