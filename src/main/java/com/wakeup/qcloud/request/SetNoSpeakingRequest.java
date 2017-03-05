package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 设置全局禁言 https://www.qcloud.com/document/product/269/4230
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class SetNoSpeakingRequest extends
		AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 必填 设置禁言配置的帐号。
	 */
	private String account;

	private Long c2cMsgNospeakingTime;

	private Long groupMsgNospeakingTime;

	@Override
	public String getApiName() {
		return "openconfigsvr/setnospeaking";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("Set_Account", account);
		map.put("C2CmsgNospeakingTime", c2cMsgNospeakingTime);
		map.put("GroupmsgNospeakingTime", groupMsgNospeakingTime);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Long getC2cMsgNospeakingTime() {
		return c2cMsgNospeakingTime;
	}

	public void setC2cMsgNospeakingTime(Long c2cMsgNospeakingTime) {
		this.c2cMsgNospeakingTime = c2cMsgNospeakingTime;
	}

	public Long getGroupMsgNospeakingTime() {
		return groupMsgNospeakingTime;
	}

	public void setGroupMsgNospeakingTime(Long groupMsgNospeakingTime) {
		this.groupMsgNospeakingTime = groupMsgNospeakingTime;
	}

}
