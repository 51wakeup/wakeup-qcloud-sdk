package com.wakeup.qcloud.listener;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;
import com.wakeup.qcloud.domain.OptPlatform;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class UrlParamDO extends BaseDO {

	private static final long serialVersionUID = -7817364903524183026L;
	@JSONField(name = "SdkAppid")
	private String sdkAppid;
	@JSONField(name = "CallbackCommand")
	private String callbackCommond;
	@JSONField(name = "contenttype")
	private String contentType;
	@JSONField(name = "ClientIP")
	private String clientIp;
	/**
	 * {@link OptPlatform}
	 */
	@JSONField(name = "OptPlatform")
	private String optPlatform;

	public String getSdkAppid() {
		return sdkAppid;
	}

	public void setSdkAppid(String sdkAppid) {
		this.sdkAppid = sdkAppid;
	}

	public String getCallbackCommond() {
		return callbackCommond;
	}

	public void setCallbackCommond(String callbackCommond) {
		this.callbackCommond = callbackCommond;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getOptPlatform() {
		return optPlatform;
	}

	public void setOptPlatform(String optPlatform) {
		this.optPlatform = optPlatform;
	}
}
