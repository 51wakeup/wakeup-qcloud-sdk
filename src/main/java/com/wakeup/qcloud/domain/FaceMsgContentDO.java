package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 表情消息元素 当接收方为iOS系统且应用处在后台时，中文版离线推送文本为“[表情]”，英文版为“[Face]”。
 * 
 * @since 2017年2月20日
 * @author kalman03
 */
public class FaceMsgContentDO extends IMMsgContentDO {

	private static final long serialVersionUID = -8796321415898203145L;

	@Override
	public String getMsgType() {
		return IMMsgType.TIMFaceElem;
	}

	/**
	 * 表情索引，用户自定义。
	 */
	@JSONField(name = "Index")
	private int index;
	/**
	 * 额外数据
	 */
	@JSONField(name = "Data")
	private String data;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
