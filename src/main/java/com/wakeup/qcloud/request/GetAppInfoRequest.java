package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.wakeup.qcloud.response.GetAppInfoResponse;
/**
 * 拉取运营数据
 * https://www.qcloud.com/document/product/269/4193
 * @since 2017年3月5日
 * @author kalman03
 */
public class GetAppInfoRequest extends AbstractQCloudIMRequest<GetAppInfoResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private Set<String> requestField;
	
	@Override
	public String getApiName() {
		return "openconfigsvr/getappinfo";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("RequestField", requestField);
		return map;
	}

	@Override
	public Class<GetAppInfoResponse> getResponseClass() {
		return GetAppInfoResponse.class;
	}

	public Set<String> getRequestField() {
		return requestField;
	}

	public void setRequestField(Set<String> requestField) {
		this.requestField = requestField;
	}
}
