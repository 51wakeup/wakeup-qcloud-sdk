package com.wakeup.qcloud.listener;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.constant.ActionStatus;
import com.wakeup.qcloud.domain.BaseDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class IMMsgResponse extends BaseDO implements QCloudMsgResponse{

	private static final long serialVersionUID = 5908267444640342152L;

	@JSONField(name = "ActionStatus")
	private String actionStatus = ActionStatus.OK;
	@JSONField(name = "ErrorInfo")
	private String errorInfo="";
	@JSONField(name = "ErrorCode")
	private int errorCode = 0;
	
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
