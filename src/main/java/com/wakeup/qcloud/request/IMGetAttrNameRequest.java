package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.IMGetAttrNameResponse;

/**
 * 管理员获取应用属性名称。
 * https://www.qcloud.com/document/product/269/4135
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMGetAttrNameRequest extends AbstractQCloudIMRequest<IMGetAttrNameResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	@Override
	public String getApiName() {
		return "openim/im_get_attr_name";
	}

	@Override
	public Map<String, Object> getTextParams() {
		return newHashMap();
	}

	@Override
	public Class<IMGetAttrNameResponse> getResponseClass() {
		return IMGetAttrNameResponse.class;
	}

}
