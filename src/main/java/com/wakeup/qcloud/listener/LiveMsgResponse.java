package com.wakeup.qcloud.listener;

import com.wakeup.qcloud.domain.BaseDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveMsgResponse extends BaseDO implements QCloudMsgResponse{

	private static final long serialVersionUID = -254892471259371675L;

	public static LiveMsgResponse SUCCESS = new LiveMsgResponse(0);
	public static LiveMsgResponse FAILED = new LiveMsgResponse(100);
	
	private int code;

	public LiveMsgResponse(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

}
