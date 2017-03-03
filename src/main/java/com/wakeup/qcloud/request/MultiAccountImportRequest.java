package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.response.MultiAccountImportResponse;

/**
 * 独立模式帐号批量导入
 * @since 2017年2月20日
 * @author kalman03
 */
public class MultiAccountImportRequest extends AbstractQCloudIMRequest<MultiAccountImportResponse> {

	private static final long serialVersionUID = 6979473998009923195L;
	private List<String> accounts;
	
	@Override
	public String getApiName() {
		return "im_open_login_svc/multiaccount_import";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("Accounts", accounts);
		return map;
	}

	@Override
	public Class<MultiAccountImportResponse> getResponseClass() {
		return MultiAccountImportResponse.class;
	}

	public List<String> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}

	
}
