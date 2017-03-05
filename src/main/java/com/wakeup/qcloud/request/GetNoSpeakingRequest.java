package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.GetNoSpeakingResponse;

/**
 *查询全局禁言
 *https://www.qcloud.com/document/product/269/4229
 * @since 2017年3月5日
 * @author kalman03
 */
public class GetNoSpeakingRequest extends AbstractQCloudIMRequest<GetNoSpeakingResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 必填	查询禁言信息的帐号。
	 */
	private String account;
	
	@Override
	public String getApiName() {
		return "openconfigsvr/getnospeaking";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("Get_Account", account);
		return map;
	}

	@Override
	public Class<GetNoSpeakingResponse> getResponseClass() {
		return GetNoSpeakingResponse.class;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

}
