package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.UserProfileItemDO;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class ProfilePortraitGetResponse extends QCloudIMResponse {

	private static final long serialVersionUID = 2203129069854587119L;

	@JSONField(name = "ErrorDisplay")
	private String errorDisplay;
	/**
	 * 返回处理失败的用户列表。
	 */
	@JSONField(name = "Fail_Account")
	private List<String> failAccounts;
	/**
	 * 返回请求包中的非法用户列表。
	 */
	@JSONField(name = "Invalid_Account")
	private List<String> invalidAccounts;
	/**
	 * 返回的用户资料结构化信息。
	 */
	@JSONField(name = "UserProfileItem")
	private List<UserProfileItemDO> userProfileItems;

	public String getErrorDisplay() {
		return errorDisplay;
	}

	public void setErrorDisplay(String errorDisplay) {
		this.errorDisplay = errorDisplay;
	}

	public List<String> getFailAccounts() {
		return failAccounts;
	}

	public void setFailAccounts(List<String> failAccounts) {
		this.failAccounts = failAccounts;
	}

	public List<String> getInvalidAccounts() {
		return invalidAccounts;
	}

	public void setInvalidAccounts(List<String> invalidAccounts) {
		this.invalidAccounts = invalidAccounts;
	}

	public List<UserProfileItemDO> getUserProfileItems() {
		return userProfileItems;
	}

	public void setUserProfileItems(List<UserProfileItemDO> userProfileItems) {
		this.userProfileItems = userProfileItems;
	}
}
