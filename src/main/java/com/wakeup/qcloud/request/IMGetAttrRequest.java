package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.wakeup.qcloud.response.IMGetAttrResponse;

/**
 *获取用户属性（必须以管理员帐号调用）。注意每次最多只能获取500个用户的属性。
 * https://www.qcloud.com/document/product/269/4131
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMGetAttrRequest extends AbstractQCloudIMRequest<IMGetAttrResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 目标用户帐号列表。
	 */
	private Set<String> toAccounts;
	
	@Override
	public String getApiName() {
		return "openim/im_get_attr";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("To_Account", toAccounts);
		return map;
	}

	@Override
	public Class<IMGetAttrResponse> getResponseClass() {
		return IMGetAttrResponse.class;
	}

}
