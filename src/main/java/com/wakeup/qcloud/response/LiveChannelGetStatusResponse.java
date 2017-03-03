package com.wakeup.qcloud.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.LiveChannelStatusDO;

/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class LiveChannelGetStatusResponse extends QCloudLiveResponse {

	private static final long serialVersionUID = -2268121514054609322L;
	
	@JSONField(name = "input")
	private LiveChannelStatusDO liveChannelStatusDO;

	public LiveChannelStatusDO getLiveChannelStatusDO() {
		return liveChannelStatusDO;
	}

	public void setLiveChannelStatusDO(LiveChannelStatusDO liveChannelStatusDO) {
		this.liveChannelStatusDO = liveChannelStatusDO;
	}
}
