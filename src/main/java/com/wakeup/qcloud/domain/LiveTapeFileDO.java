package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class LiveTapeFileDO extends BaseDO {

	private static final long serialVersionUID = 7333148361890548508L;

	/**
	 * 点播的vid,如果为空，则使用record_file_url<br>
	 * vid拼接格式：录制分片请求url格式：http://（点播bizid).vod.myqcloud.com/（vid）.f0.flv
	 */
	private String vid;

	/**
	 * 分片开始时间 ,由于I帧位置原因，并不能精确到秒
	 */
	@JSONField(name = "start_time")
	private String startTime;
	/**
	 * 分片结束时间,由于I帧位置原因，并不能精确到秒
	 */
	@JSONField(name = "end_time")
	private String endTime;
	/**
	 * 点播file_id 用点播API换取播放URL需要输入此参数
	 */
	@JSONField(name = "file_id")
	private String fileId;
	/**
	 * 播放地址,如果不为空，则使用该地址;如果为空，采用vid，按拼接格式拼接地址
	 */
	@JSONField(name = "record_file_url")
	private String recordFileUrl;

	public String getVid() {
		return vid;
	}

	public void setVid(String vid) {
		this.vid = vid;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getRecordFileUrl() {
		return recordFileUrl;
	}

	public void setRecordFileUrl(String recordFileUrl) {
		this.recordFileUrl = recordFileUrl;
	}
}
