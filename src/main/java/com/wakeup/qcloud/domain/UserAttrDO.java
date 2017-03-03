package com.wakeup.qcloud.domain;

import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月21日
 * @author kalman03
 */
public class UserAttrDO extends BaseDO {

	private static final long serialVersionUID = 7617626459281909102L;
	@JSONField(name = "To_Account")
	private String toAccount;
	/**
	 * 属性集合。每个属性是一个键值对，键为属性名，值为该用户对应的属性值。用户属性值不能超过50字节。
	 */
	@JSONField(name = "Attrs")
	private Map<String, String> attrs;

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public Map<String, String> getAttrs() {
		return attrs;
	}

	public void setAttrs(Map<String, String> attrs) {
		this.attrs = attrs;
	}
}
