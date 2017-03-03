package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月21日
 * @author kalman03
 */
public class AppDefinedDataDO extends BaseDO {

	private static final long serialVersionUID = 6229302565754731880L;
	@JSONField(name = "Key")
	private String key;
	@JSONField(name = "Value")
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
