package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.constant.IMTagProfile;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class ProfileItemDO extends BaseDO {

	private static final long serialVersionUID = -2133493030760098342L;
	/**
	 * {@link IMTagProfile} 必填
	 * 指定要设置的资料字段的名称，支持标配资料字段和自定义资料字段的设置，标配资料字段的相关信息参见：标配资料字段
	 * ；自定义资料字段的相关信息参见：自定义资料字段。
	 */
	@JSONField(name = "Tag")
	private String tag;
	/**
	 * 必填 待设置的资料字段的值，
	 */
	@JSONField(name = "Value")
	private Object value;

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

}
