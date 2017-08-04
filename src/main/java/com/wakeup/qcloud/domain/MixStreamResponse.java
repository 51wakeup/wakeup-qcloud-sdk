package com.wakeup.qcloud.domain;

import com.wakeup.qcloud.listener.LiveMsgResponse;

/**
 * <pre>
 * -27、-29	表示当前输入流查询失败
-21	表示当前输入的小画面位置参数非法，小画面越出主画面边界
-9 、-103	对当前sessionid下的输出流未取消混流操作，同时用该sessionid去操作其他的输出流。
其他	其他错误类型，如需处理请联系腾讯商务人员或者提交工单，联系电话：4009-100-100。
	</pre>
 * @since 2017年8月2日
 * @author kalman03
 */
public class MixStreamResponse extends LiveMsgResponse{

	private static final long serialVersionUID = -5993883323376729157L;

	private String message;
	private long timestamp;
	
	public MixStreamResponse(int code) {
		super(code);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	
}
