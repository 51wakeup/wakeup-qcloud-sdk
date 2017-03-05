package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 帐号登录态失效接口
 * @since 2017年2月20日
 * @author kalman03
 */
public class KickRequest extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 	必填	用户名
	 */
	private String identifier;
		   
	@Override
	public String getApiName() {
		return "im_open_login_svc/kick";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("Identifier", identifier);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
}
