package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.IMStateDO;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMQueryStateResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	@JSONField(name = "QueryResult")
	private List<IMStateDO> queryResult;

	public List<IMStateDO> getQueryResult() {
		return queryResult;
	}

	public void setQueryResult(List<IMStateDO> queryResult) {
		this.queryResult = queryResult;
	}

}
