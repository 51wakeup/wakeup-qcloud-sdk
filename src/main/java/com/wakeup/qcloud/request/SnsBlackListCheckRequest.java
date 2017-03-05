package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.response.SnsRelationCheckResponse;

/**
 * 校验黑名单
 * 
 * https://www.qcloud.com/document/product/269/3725
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsBlackListCheckRequest extends AbstractQCloudIMRequest<SnsRelationCheckResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	
	private String fromAccount;
	
	private List<String> toAccounts;
	/**
	必填	校验类型：“BlackCheckResult_Type_Both”表示双向校验；“BlackCheckResult_Type_Singal”表示单向校验。
	 */
	private String checkType;

	@Override
	public String getApiName() {
		return "sns/black_list_check";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("From_Account", fromAccount);
		map.put("To_Account", toAccounts);
		map.put("CheckType", checkType);
		return map;
	}

	@Override
	public Class<SnsRelationCheckResponse> getResponseClass() {
		return SnsRelationCheckResponse.class;
	}
}
