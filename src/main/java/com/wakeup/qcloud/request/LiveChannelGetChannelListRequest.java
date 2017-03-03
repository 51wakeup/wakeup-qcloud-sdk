package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.domain.SortType;
import com.wakeup.qcloud.response.LiveChannelGetChannelListResponse;

/**
 * <pre>
 * 接口

Live_Channel_GetChannelList：查询频道列表。
地址

API调用地址为： http://fcgi.video.qcloud.com/common_access
用途

在直播码模式下，用于查询当前频道列表。
说明

可以查询特定状态的频道列表，如可过滤当前处于开启状态的频道。
 * </pre>
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveChannelGetChannelListRequest extends AbstractQCloudLiveRequest<LiveChannelGetChannelListResponse>{

	private static final long serialVersionUID = 477053455434247968L;

	/**
	 * 0表示断流，1表示开启，3表示关闭
	 */
	private Integer status;
	/**
	 * 分页页码  从1开始，默认为1
	 */
	private int pageNum = 1;
	/**
	 * 分页大小 10~100，默认为10
	 */
	private int pageSize = 10;
	/**
	 * 排序字段	可选字段：create_time。默认为create_time
	 */
	private String orderField = "create_time";
	
	private SortType sortType ;
	
	@Override
	public Class<LiveChannelGetChannelListResponse> getResponseClass() {
		return LiveChannelGetChannelListResponse.class;
	}

	@Override
	public String getInterface() {
		return "Live_Channel_GetChannelList";
	}

	@Override
	public Map<String, Object> getBizParamsMap() {
		Map<String, Object> map = newHashMap();
		if(status != null)
		map.put("Param.n.status", status);
		map.put("Param.n.page_no", pageNum);
		map.put("Param.n.page_size", pageSize);
		map.put("Param.s.order_field", orderField);
		if(sortType != null){
			map.put("Param.s.order_field", sortType == SortType.asc?0:1);
		}
		return map;
	}

}
