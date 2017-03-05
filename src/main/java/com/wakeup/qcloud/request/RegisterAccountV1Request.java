package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 托管模式存量账号导入
 * @since 2017年3月4日
 * @author kalman03
 */
public class RegisterAccountV1Request extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 手机号(国家码-手机号)
	 */
	public final static int MOBILE = 1;
	/**
	 * 邮箱
	 */
	public final static int EMAIL = 2;
	/**
	 * 字符串帐号
	 */
	public final static int CHAR_ACCOUNT = 3;
	
	/**
	 * 	必填	为用户申请同步的帐号，长度为4-24个字符。
	 */
	private String identifier;
	/**
	 * 必填	Identifier的类型，1:手机号(国家码-手机号) 2:邮箱 3:字符串帐号
	 */
	private int identifierType; 
	
	/**
	 * 必填	Identifier的密码，长度为8-16个字符。
	 */
	private String password;
	
	@Override
	public String getApiName() {
		return "registration_service/register_account_v1";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("Identifier", identifier);
		map.put("IdentifierType", identifierType);
		map.put("Password", password);
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

	public int getIdentifierType() {
		return identifierType;
	}

	public void setIdentifierType(int identifierType) {
		this.identifierType = identifierType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
