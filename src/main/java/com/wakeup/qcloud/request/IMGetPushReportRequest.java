package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.response.IMGetPushReportResponse;

/**
 * 获取推送报告
 * https://www.qcloud.com/document/product/269/4133
 * @since 2017年3月4日
 * @author kalman03
 */
public class IMGetPushReportRequest extends AbstractQCloudIMRequest<IMGetPushReportResponse> {

	private static final long serialVersionUID = 2974451221099907305L;

	/**
	 * 必填	推送任务ID列表
	 */
	private List<String> taskIds;
	
	@Override
	public String getApiName() {
		return "openim/im_get_push_report";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("TaskIds", taskIds);
		return map;
	}

	@Override
	public Class<IMGetPushReportResponse> getResponseClass() {
		return IMGetPushReportResponse.class;
	}

	public List<String> getTaskIds() {
		return taskIds;
	}

	public void setTaskIds(List<String> taskIds) {
		this.taskIds = taskIds;
	}

}
