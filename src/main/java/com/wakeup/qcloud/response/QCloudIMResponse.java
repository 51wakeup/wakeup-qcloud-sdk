package com.wakeup.qcloud.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.QCloudResponse;
import com.wakeup.qcloud.domain.ActionStatus;

/**
 * 腾讯云通信
 * @since 2017年2月20日
 * @author kalman03
 */
public class QCloudIMResponse extends QCloudResponse {

	private static final long serialVersionUID = -123367107966351863L;
	@JSONField(name = "ActionStatus")
	private String actionStatus;
	@JSONField(name = "ErrorInfo")
	private String errorInfo;
	@JSONField(name = "ErrorCode")
	private int errorCode;
	
	public boolean isSuccess(){
		return errorCode == 0 && ActionStatus.OK.equals(actionStatus);
	}

	public String getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	public String getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
}