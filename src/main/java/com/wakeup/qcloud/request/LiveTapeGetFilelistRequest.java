package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.wakeup.qcloud.constant.SortType;
import com.wakeup.qcloud.response.LiveTapeGetFilelistResponse;

/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class LiveTapeGetFilelistRequest extends AbstractQCloudLiveRequest<LiveTapeGetFilelistResponse> {

	private static final long serialVersionUID = -1492520092554195405L;
	/**
	 * 直播码
	 */
	private String streamId;
	/**
	 * 分页页码	
	 */
	private int pageNum;
	/**
	 * 分页大小	
	 */
	private int pageSize;
	/**
	 * 默认升序
	 */
	private SortType sortType = SortType.asc;
	/**
	 * 查询开始时间
	 */
	private Date start;
	/**
	 * 查询结束时间
	 */
	private Date end;
	
	@Override
	public Class<LiveTapeGetFilelistResponse> getResponseClass() {
		return LiveTapeGetFilelistResponse.class;
	}

	@Override
	public String getInterface() {
		return "Live_Tape_GetFilelist";
	}

	@Override
	public Map<String, Object> getBizParamsMap() {
		Map<String, Object> map = newHashMap();
		map.put("Param.s.channel_id", streamId);
		map.put("Param.n.page_no", pageNum);
		map.put("Param.n.page_size", pageSize);
		map.put("Param.s.sort_type", sortType==SortType.desc ?"desc":"asc");
		map.put("Param.s.start_time", getTime(start));
		map.put("Param.s.end_time", getTime(end));
		return map;
	}
	
	private String getTime(Date date){
		if(date == null){
			return null;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(date);
	}

	public String getStreamId() {
		return streamId;
	}

	public void setStreamId(String streamId) {
		this.streamId = streamId;
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

	public SortType getSortType() {
		return sortType;
	}

	public void setSortType(SortType sortType) {
		this.sortType = sortType;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

}
