package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.constant.RelationType;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class CheckItemDO extends ResultItemDO {

	private static final long serialVersionUID = 8791403874782128992L;
	/**
	 * {@link RelationType}
	 */
	@JSONField(name = "Relation")
	private String relation;

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
}
