package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveChannelListDO extends BaseDO {

	private static final long serialVersionUID = 4679001305863133965L;
	/**
	 * 总个数
	 */
	@JSONField(name = "all_count")
	private int allCount;
	/**
	 * 列表
	 */
	@JSONField(name = "channel_list")
	private Channel channelList;

	public static class Channel extends BaseDO {
		private static final long serialVersionUID = -6532621158561167349L;
		@JSONField(name = "channel_id")
		private String channelId;

		public String getChannelId() {
			return channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}
	}
}
