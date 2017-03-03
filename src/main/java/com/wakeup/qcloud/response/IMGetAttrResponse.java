package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.UserAttrDO;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMGetAttrResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	/**
	 * 属性内容。
	 */
	@JSONField(name = "UserAttrs")
	private List<UserAttrDO> userAttrs;

	public List<UserAttrDO> getUserAttrs() {
		return userAttrs;
	}

	public void setUserAttrs(List<UserAttrDO> userAttrs) {
		this.userAttrs = userAttrs;
	}
}
