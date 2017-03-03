package com.wakeup.qcloud.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.LiveTapeFileListDO;

/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class LiveTapeGetFilelistResponse extends QCloudLiveResponse {

	private static final long serialVersionUID = -676173824486872968L;
	@JSONField(name = "output")
	private LiveTapeFileListDO output;

	public LiveTapeFileListDO getOutput() {
		return output;
	}

	public void setOutput(LiveTapeFileListDO output) {
		this.output = output;
	}
}
