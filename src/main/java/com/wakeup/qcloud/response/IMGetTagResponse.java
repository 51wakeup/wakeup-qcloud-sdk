package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.UserTagDO;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMGetTagResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	/**
	 * 用户标签内容列表
	 */
	@JSONField(name = "UserTags")
	private List<UserTagDO> userTags;

	public List<UserTagDO> getUserTags() {
		return userTags;
	}

	public void setUserTags(List<UserTagDO> userTags) {
		this.userTags = userTags;
	}

}
