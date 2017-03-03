package com.wakeup.qcloud.domain;


/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class StreamPlayUrlDO extends BaseDO {

	private static final long serialVersionUID = 6397249531559281756L;
	private String rtmpPlayUrl;
	private String flvPlayUrl;
	private String hlsPlayUrl;

	public String getRtmpPlayUrl() {
		return rtmpPlayUrl;
	}

	public void setRtmpPlayUrl(String rtmpPlayUrl) {
		this.rtmpPlayUrl = rtmpPlayUrl;
	}

	public String getFlvPlayUrl() {
		return flvPlayUrl;
	}

	public void setFlvPlayUrl(String flvPlayUrl) {
		this.flvPlayUrl = flvPlayUrl;
	}

	public String getHlsPlayUrl() {
		return hlsPlayUrl;
	}

	public void setHlsPlayUrl(String hlsPlayUrl) {
		this.hlsPlayUrl = hlsPlayUrl;
	}
}
