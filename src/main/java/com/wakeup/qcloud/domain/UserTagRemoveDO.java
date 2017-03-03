package com.wakeup.qcloud.domain;

import java.util.Set;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月21日
 * @author kalman03
 */
public class UserTagRemoveDO extends BaseDO {

	private static final long serialVersionUID = -425648200263709933L;
	@JSONField(name = "To_Account")
	private String toAccount;
	@JSONField(name = "Tags")
	private Set<String> tags;

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}
}
