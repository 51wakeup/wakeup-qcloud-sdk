package com.wakeup.qcloud.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class CreateGroupResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	/**
	 * 创建成功之后的群ID，由IM云后台分配
	 */
	@JSONField(name = "GroupId")
	private String GroupId;

	public String getGroupId() {
		return GroupId;
	}

	public void setGroupId(String groupId) {
		GroupId = groupId;
	}

}
