package com.wakeup.qcloud.response;

import com.wakeup.qcloud.domain.LiveQueueDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveQueueGetResponse extends QCloudLiveResponse{

	private static final long serialVersionUID = -5967086673579592917L;
	private LiveQueueDO output;

	public LiveQueueDO getOutput() {
		return output;
	}

	public void setOutput(LiveQueueDO output) {
		this.output = output;
	}
}
