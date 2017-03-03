package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 管理员给用户删除标签。注意每次最多只能给500个用户删除标签。
 * 
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMRemoveAllTagsRequest extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	@JSONField(name="To_Account")
	private Set<String> toAccounts;
	
	@Override
	public String getApiName() {
		return "openim/im_remove_all_tags";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("To_Account", toAccounts);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}
}
