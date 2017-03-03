package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class LiveChannelStatusDO extends BaseDO {

	private static final long serialVersionUID = -2584660177208049737L;
	/**
	 * 0:原始码率；10:普清；20:高清
	 */
	@JSONField(name = "rate_type")
	private int rateType;
	/**
	 * 1:rtmp/flv；2:hls；3:rtmp/flv+hls
	 */
	@JSONField(name = "recv_type")
	private int recvType;
	/**
	 * 0:断流；1:开启；3:关闭
	 */
	@JSONField(name = "status")
	private int status;

	public int getRateType() {
		return rateType;
	}

	public void setRateType(int rateType) {
		this.rateType = rateType;
	}

	public int getRecvType() {
		return recvType;
	}

	public void setRecvType(int recvType) {
		this.recvType = recvType;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
