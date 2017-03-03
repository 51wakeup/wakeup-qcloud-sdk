package com.wakeup.qcloud.response;

import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMGetAttrNameResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	/**
	 * 包含多个键对。每对键值对，表示第几个属性对应的名称。比如"0":"xxx"表示第0号属性的名称是xxx。
	 */
	@JSONField(name = "AttrNames")
	private Map<Long, String> attrNames;

	public Map<Long, String> getAttrNames() {
		return attrNames;
	}

	public void setAttrNames(Map<Long, String> attrNames) {
		this.attrNames = attrNames;
	}

}
