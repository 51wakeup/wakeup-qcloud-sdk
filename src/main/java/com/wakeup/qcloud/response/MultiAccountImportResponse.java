package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class MultiAccountImportResponse extends QCloudIMResponse{

	private static final long serialVersionUID = -2311631562736465793L;
	@JSONField(name="FailAccounts")
	private List<String> failAccounts;

	public List<String> getFailAccounts() {
		return failAccounts;
	}

	public void setFailAccounts(List<String> failAccounts) {
		this.failAccounts = failAccounts;
	}
}
