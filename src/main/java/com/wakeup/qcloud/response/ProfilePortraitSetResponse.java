package com.wakeup.qcloud.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class ProfilePortraitSetResponse extends QCloudIMResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2203129069854587119L;

	@JSONField(name="ErrorDisplay")
	private String errorDisplay;

	public String getErrorDisplay() {
		return errorDisplay;
	}

	public void setErrorDisplay(String errorDisplay) {
		this.errorDisplay = errorDisplay;
	}
}
