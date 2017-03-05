package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 解散群组
 * https://www.qcloud.com/document/product/269/1624
 * @since 2017年3月5日
 * @author kalman03
 */
public class DestroyGroupRequest extends
		AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private String groupId;
	
	@Override
	public String getApiName() {
		return "group_open_http_svc/destroy_group";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
