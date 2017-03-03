package com.wakeup.qcloud.response;

import com.wakeup.qcloud.QCloudResponse;

/**
 * 腾讯云直播
 * @since 2017年2月23日
 * @author kalman03
 */
public class QCloudLiveResponse extends QCloudResponse {

	private static final long serialVersionUID = 6907998943910634354L;
	/**
	 * 返回码 int 0:成功；其他值:失败
	 */
	private int ret;
	/**
	 * 错误信息
	 */
	private String message;

	@Override
	public boolean isSuccess() {
		return ret == 0;
	}

	public int getRet() {
		return ret;
	}

	public void setRet(int ret) {
		this.ret = ret;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
