package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveMsgStreamEventDO extends LiveMsgBaseDO {
	
	private static final long serialVersionUID = -3416288831454197955L;
	@JSONField(name = "app")
	private String app;
	@JSONField(name = "appname")
	private String appName;

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
}
