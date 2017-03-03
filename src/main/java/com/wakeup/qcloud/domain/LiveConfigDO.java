package com.wakeup.qcloud.domain;


/**
 * 直播的相关配置
 * 
 * @since 2017年2月23日
 * @author kalman03
 */
public class LiveConfigDO extends BaseDO {

	private static final long serialVersionUID = -4656798058596227360L;

	/**
	 * API鉴权Key
	 */
	private String key;

	/**
	 * sdkappid
	 */
	private String sdkAppId;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSdkAppId() {
		return sdkAppId;
	}

	public void setSdkAppId(String sdkAppId) {
		this.sdkAppId = sdkAppId;
	}
}
