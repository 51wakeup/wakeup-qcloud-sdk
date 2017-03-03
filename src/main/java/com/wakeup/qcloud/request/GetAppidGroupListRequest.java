package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.domain.GroupType;
import com.wakeup.qcloud.response.GetAppidGroupListResponse;

/**
 * APP管理员可以通过该接口获取APP中所有群组的ID。
 * 
 * @since 2017年2月20日
 * @author kalman03
 */
public class GetAppidGroupListRequest extends AbstractQCloudIMRequest<GetAppidGroupListResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 本次获取的群组ID数量的上限，不得超过10000。如果不填，默认为最大值10000。
	 */
	private long limit;
	/**
	 * 群太多时分页拉取标志，第一次填0，以后填上一次返回的值，返回的Next为0代表拉完了。
	 */
	private long next;
	/**
	 * {@link GroupType} 拉取哪种群组形态，不填为拉取所有
	 */
	private String groupType;

	@Override
	public String getApiName() {
		return "group_open_http_svc/get_appid_group_list";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("Limit", limit);
		map.put("Next", next);
		map.put("GroupType", groupType);
		return map;
	}

	@Override
	public Class<GetAppidGroupListResponse> getResponseClass() {
		return GetAppidGroupListResponse.class;
	}

}
