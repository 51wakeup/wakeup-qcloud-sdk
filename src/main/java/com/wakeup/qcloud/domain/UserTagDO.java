package com.wakeup.qcloud.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月21日
 * @author kalman03
 */
public class  UserTagDO extends BaseDO {

	private static final long serialVersionUID = -8597015380307984144L;
	/**
	 * 必填	目标用户帐号。
	 */
	@JSONField(name = "To_Account")
	private String toAccount;
	/**
	 * 必填	标签集合。
	 */
	@JSONField(name = "Tags")
	private List<String> tags;

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
