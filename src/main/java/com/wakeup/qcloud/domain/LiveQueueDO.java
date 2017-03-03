package com.wakeup.qcloud.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveQueueDO extends BaseDO {

	private static final long serialVersionUID = 2768660010373028629L;

	/**
	 * 数量
	 */
	private int count;
	
	private List<LiveQueueData> data;

	public static class LiveQueueData {
		/**
		 * 直播码
		 */
		@JSONField(name = "stream_id")
		private String streamId;
		/**
		 * 截图URL 完整的url为: http://(cos_bucketname)-(cos_appid).file.myqcloud.com/文件名
		 */
		@JSONField(name = "pic_url")
		private String picUrl;
		/**
		 * 截图时间	由于I帧位置原因，并不能精确到秒
		 */
		@JSONField(name = "create_time")
		private long createTime;

		public String getStreamId() {
			return streamId;
		}

		public void setStreamId(String streamId) {
			this.streamId = streamId;
		}

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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<LiveQueueData> getData() {
		return data;
	}

	public void setData(List<LiveQueueData> data) {
		this.data = data;
	}

}
