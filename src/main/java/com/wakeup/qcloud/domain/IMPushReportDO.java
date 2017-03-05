package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 推送任务报告列表。
 * 
 * @since 2017年3月4日
 * @author kalman03
 */
public class IMPushReportDO extends BaseDO {

	private static final long serialVersionUID = -898135875413831433L;
	/**
	 * 推送任务ID
	 */
	@JSONField(name = "TaskId")
	private String taskId;
	/**
	 * 0(未处理) / 1（推送中) / 2（推送完成） 。注意：推送完成不代表完全推送成功，具体发送情况见Finished和Total字段数据。
	 */
	@JSONField(name = "Status")
	private int status;
	/**
	 * 推送开始时间，Status不为0，才有这个字段。
	 */
	@JSONField(name = "StartTime")
	private String startTime;
	/**
	 * 已完成推送人数。
	 */
	@JSONField(name = "Finished")
	private int finished;

	/**
	 * 需推送总人数。
	 */
	@JSONField(name = "Total")
	private int total;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public int getFinished() {
		return finished;
	}

	public void setFinished(int finished) {
		this.finished = finished;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
