package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.ResultItemDO;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsFriendResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	
	@JSONField(name = "ResultItem")
	private List<ResultItemDO> resultItems;
	/**
	 * 返回处理失败的用户列表。
	 */
	@JSONField(name="Fail_Account")
	private List<String> failAccounts;
	/**
	 * 返回请求包中的非法用户列表。
	 */
	@JSONField(name="Invalid_Account")
	private List<String> invalidAccounts;
	/**
	 * 详细的客户端展示信息。
	 */
	@JSONField(name="ErrorDisplay")
	private String errorDisplay;

	public List<ResultItemDO> getResultItems() {
		return resultItems;
	}

	public void setResultItems(List<ResultItemDO> resultItems) {
		this.resultItems = resultItems;
	}

	public List<String> getFailAccounts() {
		return failAccounts;
	}

	public void setFailAccounts(List<String> failAccounts) {
		this.failAccounts = failAccounts;
	}

	public List<String> getInvalidAccounts() {
		return invalidAccounts;
	}

	public void setInvalidAccounts(List<String> invalidAccounts) {
		this.invalidAccounts = invalidAccounts;
	}

	public String getErrorDisplay() {
		return errorDisplay;
	}

	public void setErrorDisplay(String errorDisplay) {
		this.errorDisplay = errorDisplay;
	}
	

}
