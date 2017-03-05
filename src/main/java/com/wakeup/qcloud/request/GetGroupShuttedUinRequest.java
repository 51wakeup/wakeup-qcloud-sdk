package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.GetGroupShuttedUinResponse;

/**
 * 获取群组被禁言用户列表 https://www.qcloud.com/document/product/269/2925
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class GetGroupShuttedUinRequest extends AbstractQCloudIMRequest<GetGroupShuttedUinResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 必填 需要获取被禁言成员列表的群组ID。
	 */
	private String groupId;

	@Override
	public String getApiName() {
		return "group_open_http_svc/get_group_shutted_uin";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		return map;
	}

	@Override
	public Class<GetGroupShuttedUinResponse> getResponseClass() {
		return GetGroupShuttedUinResponse.class;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}
