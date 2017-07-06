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
 * 'http://200025724.vod.myqcloud.com/200025724_ac92b781a22c4a3e937c9e61c2624af7.f0.flv
 * ' 。
 * 
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveMsgAvRecordCreatedDO extends LiveMsgBaseDO {

	private static final long serialVersionUID = 6003356574070532172L;

	/**
	 * 点播用vid，在点播平台可以唯一定位一个点播视频文件
	 */
	@JSONField(name = "video_id")
	private String videoId;
	/**
	 * 点播视频的下载地址
	 */
	@JSONField(name = "video_url")
	private String videoUrl;
	/**
	 * 文件大小
	 */
	@JSONField(name = "file_size")
	private long fileSize;
	/**
	 * {@link LiveRecordFileFormat},文件格式	flv, hls, mp4
	 */
	@JSONField(name = "file_format")
	private String fileFormat;
	
	@JSONField(name = "file_id")
	private String fileId;
	/**
	 * 分片开始时间戳
	 */
	@JSONField(name = "start_time")
	private long startTime;
	/**
	 * 分片结束时间戳
	 */
	@JSONField(name = "end_time")
	private long endTime;
	/**
	 * 推流时长
	 */
	@JSONField(name = "duration")
	private long duration;
	/**
	 * 推流url参数
	 */
	@JSONField(name = "stream_param")
	private String streamParam;
	/**
	 * 录制文件id
	 */
	@JSONField(name = "record_file_id")
	private String recordFileId;
	/**
	 * 是否开启点播2.0 0表示未开启，1表示开启
	 */
	@JSONField(name = "vod2Flag")
	private int vod2Flag;

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
	public String getRecordFileId() {
		return recordFileId;
	}

	public void setRecordFileId(String recordFileId) {
		this.recordFileId = recordFileId;
	}

	public int getVod2Flag() {
		return vod2Flag;
	}

	public void setVod2Flag(int vod2Flag) {
		this.vod2Flag = vod2Flag;
	}

	public String getStreamParam() {
		return streamParam;
	}

	public void setStreamParam(String streamParam) {
		this.streamParam = streamParam;
	}
}
