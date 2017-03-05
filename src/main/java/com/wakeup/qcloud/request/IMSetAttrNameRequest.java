package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 设置应用属性名称
 * https://www.qcloud.com/document/product/269/4134
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMSetAttrNameRequest extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * key:表示第几个属性，（“0”到“9”之间）。
	 * value:属性名最长不超过50字节。应用最多可以有10个推送属性（编号从0到9），每个属性的含义用户自定义。
	 */
	private Map<String, String> attrNames;

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
