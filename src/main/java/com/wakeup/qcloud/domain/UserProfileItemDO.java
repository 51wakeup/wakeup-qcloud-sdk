package com.wakeup.qcloud.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class UserProfileItemDO extends BaseDO {

	private static final long serialVersionUID = -3193659732463420974L;
	@JSONField(name = "ProfileItem")
	private List<ProfileItemDO> profileItemList;
	/**
	 * 返回的用户的Identifier。
	 */
	@JSONField(name = "To_Account")
	private String toAccount;

	public List<ProfileItemDO> getProfileItemList() {
		return profileItemList;
	}

	public void setProfileItemList(List<ProfileItemDO> profileItemList) {
		this.profileItemList = profileItemList;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}
}
