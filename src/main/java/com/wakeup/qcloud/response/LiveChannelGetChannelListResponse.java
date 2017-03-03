package com.wakeup.qcloud.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.LiveChannelListDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveChannelGetChannelListResponse extends QCloudLiveResponse{

	
	private static final long serialVersionUID = 4247186788323831053L;

	@JSONField(name="output")
	private LiveChannelListDO output;

	public LiveChannelListDO getOutput() {
		return output;
	}

	public void setOutput(LiveChannelListDO output) {
		this.output = output;
	}
}
