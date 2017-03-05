package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.constant.IMMsgType;

/**
 * 文本消息元素
 * 
 * @since 2017年2月20日
 * @author kalman03
 */
public class TextMsgContentDO extends IMMsgContentDO {

	private static final long serialVersionUID = 4211122533387698343L;

	/**
	 * 当接收方为iOS系统且应用处在后台时，Text字段作为离线推送文本。
	 */
	@JSONField(name = "Text")
	private String text;

	@Override
	public String getMsgType() {
		return IMMsgType.TIMTextElem;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
