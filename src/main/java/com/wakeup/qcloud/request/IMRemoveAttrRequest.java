package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.UserAttrRemoveDO;
import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 管理员给用户删除属性。注意每次最多只能给500个用户删除属性。
 * 
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMRemoveAttrRequest extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private List<UserAttrRemoveDO> userAttrs;
	
	@Override
	public String getApiName() {
		return "openim/im_remove_attr";
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
