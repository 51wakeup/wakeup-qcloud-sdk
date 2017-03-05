package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.wakeup.qcloud.response.IMQueryStateResponse;

/**
 * 获取用户在线状态 https://www.qcloud.com/document/product/269/2566
 * @since 2017年3月4日
 * @author kalman03
 */
public class IMQueryStateRequest extends
		AbstractQCloudIMRequest<IMQueryStateResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 必填 需要查询这些Identifier的在线状态， 一次最多查询500个Identifier的状态。
	 */
	private Set<String> toAccounts;

	@Override
	public String getApiName() {
		return "openim/querystate";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("To_Account", toAccounts);
		return map;
	}

	@Override
	public Class<IMQueryStateResponse> getResponseClass() {
		return IMQueryStateResponse.class;
	}

}
