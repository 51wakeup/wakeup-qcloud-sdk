package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.response.SnsRelationCheckResponse;

/**
 * 校验好友
 * https://www.qcloud.com/document/product/269/1646
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsFriendCheckRequest extends
		AbstractQCloudIMRequest<SnsRelationCheckResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	
	private String fromAccount;
	
	private List<String> toAccounts;
	/**
	 * <pre>
	 * 单向校验好友关系	CheckResult_Type_Singal	只会检查From_Account的好友表中是否有To_Account，不会检查To_Account的好友表中是否有From_Account
	 * 双向校验好友关系	CheckResult_Type_Both	既会检查From_Account的好友表中是否有To_Account，也会检查To_Account的好友表中是否有From_Account
	 *</pre>
	 */
	private String checkType;

	@Override
	public String getApiName() {
		return "sns/friend_check";
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
