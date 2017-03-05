package com.wakeup.qcloud.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.IMPushReportDO;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class IMGetPushReportResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	/**
	 * 推送任务报告列表。
	 */
	@JSONField(name = "Reports")
	private IMPushReportDO reports;

	public IMPushReportDO getReports() {
		return reports;
	}

	public void setReports(IMPushReportDO reports) {
		this.reports = reports;
	}

}
