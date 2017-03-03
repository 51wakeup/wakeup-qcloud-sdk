package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.GetLiveStatResponse;

/**
 * <pre>
 * 接口
 * Get_LiveStat：查询指定直播流的推流和播放信息
 * Get_LivePushStat ：仅返回推流统计信息以提高查询效率
 * Get_LivePlayStat ：仅返回播放统计信息以提高查询效率
 * 地址
 * API调用地址为： http://statcgi.video.qcloud.com/common_access
 * 用途
 * 查询某条直播流的统计信息（如观看人数、带宽、码率、帧率等等）
 * 查询当前正在直播状态中的若干条直播流的统计信息（建议采用分页查询避免单次回包数据过大）
 * 说明
 * 统计数据均为查询时间点的瞬时统计数据，而并非历史累计数据。
 * 如果目标流不在直播中，则返回结果中的output字段为空。
 * 推流信息的统计数据每5秒钟更新一次，也就是快于5秒的查询频率是浪费的。
 * 播放信息的统计数据每1分钟更新一次，也就是快于60秒的查询频率是浪费的。
 * BETA
 * 统计接口目前尚处于Beta阶段，并未全员放开，未开通即调用此接口会收到“cmd is invalid ”提示，如您急需请联系我们。
 * </pre>
 * 
 * @since 2017年2月23日
 * @author kalman03
 */
public class GetLiveStatRequest extends AbstractQCloudLiveRequest<GetLiveStatResponse> {

	private static final long serialVersionUID = 1392722750265082426L;

	/**
	 * 分页页码,从1开始，默认为1
	 */
	private int pageNum;
	/**
	 * 分页大小,1~300，默认为300
	 */
	private int pageSize;
	/**
	 * 直播码,如不设置stream_id：查询所有正在直播中的流
	 */
	private String streamId;
	
	@Override
	public Class<GetLiveStatResponse> getResponseClass() {
		return GetLiveStatResponse.class;
	}

	@Override
	public String getInterface() {
		return "Get_LiveStat";
	}

	@Override
	public Map<String, Object> getBizParamsMap() {
		Map<String, Object> params = newHashMap();
		params.put("Param.n.page_no", pageNum);
		params.put("Param.n.page_size", pageSize);
		params.put("Param.s.stream_id", streamId);
		return params;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getStreamId() {
		return streamId;
	}

	public void setStreamId(String streamId) {
		this.streamId = streamId;
	}
}
