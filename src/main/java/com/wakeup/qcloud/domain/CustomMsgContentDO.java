package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.constant.IMMsgType;

/**
 * 当接收方为iOS系统且应用处在后台时，Desc作为推送文本， Ext字段作为APNS请求包Payloads中的ext键值下发，
 * Data字段不作为APNS的Payloads字段下发。注意，一条组合消息中只能包含TIMCustomElem自定义消息元素。
 * 
 * @since 2017年2月20日
 * @author kalman03
 */
public class CustomMsgContentDO extends IMMsgContentDO {
	
	private static final long serialVersionUID = 6576977154693766879L;
	/**
	 * 自定义消息数据。 不作为APNS的payload中字段下发，故从payload中无法获取Data字段。
	 */
	@JSONField(name = "Data")
	private String data;
	/**
	 * 自定义消息描述信息；当接收方为iPhone后台在线时，做iOS离线Push时文本展示。
	 */
	@JSONField(name = "Desc")
	private String desc;
	/**
	 * 扩展字段；当接收方为iOS系统且应用处在后台时，此字段作为APNS请求包Payloads中的ext键值下发，Ext的协议格式由业务方确定，
	 * APNS只做透传。
	 */
	@JSONField(name = "Ext")
	private String ext;
	/**
	 * 自定义APNS推送铃音。
	 */
	@JSONField(name = "Sound")
	private String sound;

	@Override
	public String getMsgType() {
		return IMMsgType.TIMCustomElem;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}
