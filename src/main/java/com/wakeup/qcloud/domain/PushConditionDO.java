package com.wakeup.qcloud.domain;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * Condition包含TagsOr和TagsAnd两种属性条件类型。这两种可以类型可以并存。这时候表示同时满足TagsOr和TagsAnd的用户。如果没有Condition,则推送给全部用户。
 * @since 2017年3月4日
 * @author kalman03
 */
public class PushConditionDO extends BaseDO {

	private static final long serialVersionUID = -2475624049758496606L;
	/**
	 *选填	属性条件的交集。 注意属性推送和标签推送不可同时作为推送条件。
	 */
	@JSONField(name = "AttrsAnd")
	private Map<String, String> attrsAnd;
	/**
	 * 选填	属性条件的并集。注意属性推送和标签推送不可同时作为推送条件。
	 */
	@JSONField(name = "AttrsOr")
	private Map<String, String> attrsOr;
	/**
	 * 选填	标签条件的交集。标签是一个不超过50字节的字符串。 注意属性推送和标签推送不可同时作为推送条件。
	 */
	@JSONField(name = "TagsAnd")
	private List<String> tagsAnd;
	/**
	 * 选填	标签条件的并集。标签是一个不超过50字节的字符串。 注意属性推送和标签推送不可同时作为推送条件。
	 */
	@JSONField(name = "TagsOr")
	private List<String> tagsOr;

	public Map<String, String> getAttrsAnd() {
		return attrsAnd;
	}

	public void setAttrsAnd(Map<String, String> attrsAnd) {
		this.attrsAnd = attrsAnd;
	}

	public Map<String, String> getAttrsOr() {
		return attrsOr;
	}

	public void setAttrsOr(Map<String, String> attrsOr) {
		this.attrsOr = attrsOr;
	}

	public List<String> getTagsAnd() {
		return tagsAnd;
	}

	public void setTagsAnd(List<String> tagsAnd) {
		this.tagsAnd = tagsAnd;
	}

	public List<String> getTagsOr() {
		return tagsOr;
	}

	public void setTagsOr(List<String> tagsOr) {
		this.tagsOr = tagsOr;
	}
}
