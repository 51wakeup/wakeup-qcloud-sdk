package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveMsgScreenshotCreatedDO extends LiveMsgBaseDO {

	private static final long serialVersionUID = 6003356574070532172L;

	/**
	 * 图片路径
	 */
	@JSONField(name = "pic_url")
	private String picUrl;
	/**
	 * 截图时间戳（unix时间戳，由于I帧干扰，暂时不能精确到秒级）
	 */
	@JSONField(name = "create_time")
	private long createTime;

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

}
