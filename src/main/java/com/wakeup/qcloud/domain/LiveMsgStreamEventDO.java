package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveMsgStreamEventDO extends LiveMsgBaseDO {

	private static final long serialVersionUID = -3416288831454197955L;
	/**
	 * 推流域名
	 */
	@JSONField(name = "app")
	private String app;
	/**
	 * 推流路径
	 */
	@JSONField(name = "appname")
	private String appName;
	/**
	 * 消息产生的时间
	 */
	@JSONField(name = "update_time")
	private String updateTime;
	/**
	 * 消息序列号，标识一次推流活动，一次推流活动会产生相同序列号的推流和断流消息
	 */
	@JSONField(name = "sequence")
	private String sequence;
	/**
	 * Upload接入点的ip
	 */
	@JSONField(name = "node")
	private String node;
	/**
	 * 用户推流ip
	 */
	@JSONField(name = "user_ip")
	private String userIp;
	/**
	 * 断流错误码
	 */
	@JSONField(name = "errcode")
	private int errcode;
	/**
	 * 断流错误信息
	 */
	@JSONField(name = "errmsg")
	private String errmsg;
	/**
	 * 推流url参数
	 */
	@JSONField(name = "stream_param")
	private String streamParam;
	/**
	 * 推流时长,单位ms
	 */
	@JSONField(name = "push_duration")
	private String pushDuration;

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getNode() {
		return node;
	}

	public void setNode(String node) {
		this.node = node;
	}

	public String getUserIp() {
		return userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public int getErrcode() {
		return errcode;
	}

	public void setErrcode(int errcode) {
		this.errcode = errcode;
	}

	public String getErrmsg() {
		return errmsg;
	}

	public void setErrmsg(String errmsg) {
		this.errmsg = errmsg;
	}

	public String getStreamParam() {
		return streamParam;
	}

	public void setStreamParam(String streamParam) {
		this.streamParam = streamParam;
	}

	public String getPushDuration() {
		return pushDuration;
	}

	public void setPushDuration(String pushDuration) {
		this.pushDuration = pushDuration;
	}
}
