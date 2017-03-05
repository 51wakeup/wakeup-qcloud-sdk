package com.wakeup.qcloud.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class InfoItemDO extends BaseDO {

	private static final long serialVersionUID = -2886908770763352462L;

	/**
	 * 好友的Identifier。
	 */
	@JSONField(name = "Info_Account")
	private String infoAccount;
	/**
	 * 好友的详细信息数组，数组每一个元素都包括Tag和Value。
	 */
	@JSONField(name = "SnsProfileItem")
	private List<ProfileItemDO> profileItem;

	public String getInfoAccount() {
		return infoAccount;
	}

	public void setInfoAccount(String infoAccount) {
		this.infoAccount = infoAccount;
	}

	public List<ProfileItemDO> getProfileItem() {
		return profileItem;
	}

	public void setProfileItem(List<ProfileItemDO> profileItem) {
		this.profileItem = profileItem;
	}

}
