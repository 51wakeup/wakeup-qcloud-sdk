package com.wakeup.qcloud.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class IMPushResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	/**
	 * 属性内容。
	 */
	@JSONField(name = "TaskId")
	private String taskId;
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
