package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.StreamInfoDO;

/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class GetLiveStatResponse extends QCloudLiveResponse {

	private static final long serialVersionUID = -2748721174552871504L;
	/**
	 * 所有在线的直播流数量,请求中指定stream_id时返回1
	 */
	@JSONField(name = "stream_count")
	private long streamCount;
	/**
	 * 当前账号在查询时间点的总带宽，单位：Mbps
	 */
	@JSONField(name = "total_bandwidth")
	private double totalBandWidth;
	/**
	 * 当前账号在查询时间点的总在线人数，单位：人
	 */
	@JSONField(name = "total_online")
	private long totalOnline;
	/**
	 * 直播流统计信息
	 */
	@JSONField(name="stream_info")
	private List<StreamInfoDO> streamInfo;
	public long getStreamCount() {
		return streamCount;
	}
	public void setStreamCount(long streamCount) {
		this.streamCount = streamCount;
	}
	public double getTotalBandWidth() {
		return totalBandWidth;
	}
	public void setTotalBandWidth(double totalBandWidth) {
		this.totalBandWidth = totalBandWidth;
	}
	public long getTotalOnline() {
		return totalOnline;
	}
	public void setTotalOnline(long totalOnline) {
		this.totalOnline = totalOnline;
	}
	public List<StreamInfoDO> getStreamInfo() {
		return streamInfo;
	}
	public void setStreamInfo(List<StreamInfoDO> streamInfo) {
		this.streamInfo = streamInfo;
	}
}
