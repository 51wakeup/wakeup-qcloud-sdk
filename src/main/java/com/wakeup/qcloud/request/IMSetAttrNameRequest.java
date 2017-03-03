package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 设置应用属性名称
 * 
 * @since 2017年2月20日
 * @author kalman03
 * @param <T>
 */
public class IMSetAttrNameRequest extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	@JSONField(name = "AttrNames")
	private Map<Long, String> attrNames;

	@Override
	public String getApiName() {
		return "openim/im_set_attr_name";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("AttrNames", attrNames);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

}
