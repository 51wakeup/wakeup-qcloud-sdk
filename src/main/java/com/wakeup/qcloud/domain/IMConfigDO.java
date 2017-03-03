package com.wakeup.qcloud.domain;


/**
 * 云通信的相关配置
 * @since 2017年2月23日
 * @author kalman03
 */
public class IMConfigDO extends BaseDO {

	private static final long serialVersionUID = 6941406456687350201L;
	
	private String sdkAppId;
	private String identifier;
	private String privateKey;
	private String publicKey;

	public String getSdkAppId() {
		return sdkAppId;
	}

	public void setSdkAppId(String sdkAppId) {
		this.sdkAppId = sdkAppId;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
}
