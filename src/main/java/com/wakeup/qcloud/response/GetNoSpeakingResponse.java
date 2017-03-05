package com.wakeup.qcloud.response;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class GetNoSpeakingResponse extends QCloudIMResponse {

	private static final long serialVersionUID = 1095980905089249771L;
	/**
	 * 单聊消息禁言时间，秒为单位，非负整数。等于0代表没有被设置禁言；等于最大值4294967295(十六进制0xFFFFFFFF)代表被永久设置禁言；
	 * 其它代表该账户禁言时间。
	 */
	@JSONField(name = "C2CmsgNospeakingTime")
	private long c2cMsgNospeakingTime;
	/**
	 * 群组消息禁言时间，秒为单位，非负整数。等着0代表没有被设置禁言；等于最大值4294967295(十六进制0xFFFFFFFF)代表被永久设置禁言；
	 * 其它代表该账户禁言时间。
	 */
	@JSONField(name = "GroupmsgNospeakingTime")
	private long groupMsgNospeakingTime;

	public long getC2cMsgNospeakingTime() {
		return c2cMsgNospeakingTime;
	}

	public void setC2cMsgNospeakingTime(long c2cMsgNospeakingTime) {
		this.c2cMsgNospeakingTime = c2cMsgNospeakingTime;
	}

	public long getGroupMsgNospeakingTime() {
		return groupMsgNospeakingTime;
	}

	public void setGroupMsgNospeakingTime(long groupMsgNospeakingTime) {
		this.groupMsgNospeakingTime = groupMsgNospeakingTime;
	}
}
