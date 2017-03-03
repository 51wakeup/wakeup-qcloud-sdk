package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.SendMsgResultDO;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMBatchSendMsgResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	@JSONField(name = "ErrorList")
	private List<SendMsgResultDO> errorList;

	public List<SendMsgResultDO> getErrorList() {
		return errorList;
	}

	public void setErrorList(List<SendMsgResultDO> errorList) {
		this.errorList = errorList;
	}

}
