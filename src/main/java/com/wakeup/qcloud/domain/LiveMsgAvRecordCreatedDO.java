package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.constant.LiveRecordFileFormat;

/**
 * 
 <table border="1">
 * <tr>
 * <th>字段名称</th>
 * <th>类型</th>
 * <th>含义</th>
 * </tr>
 * <tr>
 * <td>video_id</td>
 * <td>string</td>
 * <td>点播用vid，在点播平台可以唯一定位一个点播视频文件</td>
 * </tr>
 * <tr>
 * <td>video_url</td>
 * <td>string</td>
 * <td>点播视频的下载地址</td>
 * </tr>
 * <tr>
 * <td>file_size</td>
 * <td>string</td>
 * <td>文件大小</td>
 * </tr>
 * <tr>
 * <td>start_time</td>
 * <td>int</td>
 * <td>开始时间（unix时间戳，由于I帧干扰，暂时不能精确到秒级）</td>
 * </tr>
 * <tr>
 * <td>end_time</td>
 * <td>int</td>
 * <td>结束时间（unix时间戳，由于I帧干扰，暂时不能精确到秒级）</td>
 * </tr>
 * </table>
 * 示例：一个id为9192487266581821586的新的flv录制分片已经生成，播放地址为：
 * 'http://200025724.vod.myqcloud.com/200025724_ac92b781a22c4a3e937c9e61c2624af7.f0.flv'
 * 。
 * 
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveMsgAvRecordCreatedDO extends LiveMsgBaseDO {

	private static final long serialVersionUID = 6003356574070532172L;

	@JSONField(name = "video_id")
	private String videoId;
	@JSONField(name = "video_url")
	private String videoUrl;
	@JSONField(name = "file_size")
	private long fileSize;
	/**
	 * {@link LiveRecordFileFormat}
	 */
	@JSONField(name="file_format")
	private String fileFormat;
	@JSONField(name="file_id")
	private String fileId;
	@JSONField(name = "start_time")
	private long startTime;
	@JSONField(name = "end_time")
	private long endTime;
	@JSONField(name="duration")
	private long duration;
	
	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
}
