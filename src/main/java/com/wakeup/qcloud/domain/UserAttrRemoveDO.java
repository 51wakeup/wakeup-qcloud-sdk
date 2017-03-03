package com.wakeup.qcloud.domain;

import java.util.Set;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月21日
 * @author kalman03
 */
public class UserAttrRemoveDO extends BaseDO {

	private static final long serialVersionUID = 7617626459281909102L;
	@JSONField(name = "To_Account")
	private String toAccount;
	/**
	 * 属性集合，注意这里只需要给出属性名即可。Attrs形式及含义参见推送请求包字段说明。
	 */
	@JSONField(name = "Attrs")
	private Set<String> attrs;

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public Set<String> getAttrs() {
		return attrs;
	}

	public void setAttrs(Set<String> attrs) {
		this.attrs = attrs;
	}
}
