package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.UserAttrDO;
import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 管理员给用户设置属性。每次最多只能给500个用户设置属性。注意使用前请先定义应用的用户属性。
 * 
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMSetAttrRequest extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private List<UserAttrDO> userAttrs;
	
	@Override
	public String getApiName() {
		return "openim/im_set_attr";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("UserAttrs", userAttrs);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

}
