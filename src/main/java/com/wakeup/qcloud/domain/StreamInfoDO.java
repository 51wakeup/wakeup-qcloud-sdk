package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class StreamInfoDO extends BaseDO {

	private static final long serialVersionUID = 2108874800174494052L;
	/**
	 * 直播码
	 */
	@JSONField(name = "stream_name")
	private String streamName;
	/**
	 * 该直播流的瞬时带宽占用 单位：Mbps
	 */
	@JSONField(name = "bandwidth")
	private double bandWidth;
	/**
	 * 该直播流的瞬时在线人数 单位：人
	 */
	@JSONField(name = "online")
	private long online;
	/**
	 * 推流客户端IP
	 */
	@JSONField(name = "client_ip")
	private String clientIp;
	/**
	 * 接流服务器IP
	 */
	@JSONField(name = "server_ip")
	private String serverIp;
	/**
	 * 瞬时推流帧率
	 */
	@JSONField(name = "fps")
	private int fps;
	/**
	 * 瞬时推流码率
	 */
	@JSONField(name = "speed")
	private int speed;
	public String getStreamName() {
		return streamName;
	}
	public void setStreamName(String streamName) {
		this.streamName = streamName;
	}
	public double getBandWidth() {
		return bandWidth;
	}
	public void setBandWidth(double bandWidth) {
		this.bandWidth = bandWidth;
	}
	public long getOnline() {
		return online;
	}
	public void setOnline(long online) {
		this.online = online;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getServerIp() {
		return serverIp;
	}
	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}
	public int getFps() {
		return fps;
	}
	public void setFps(int fps) {
		this.fps = fps;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
