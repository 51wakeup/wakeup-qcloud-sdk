package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.GroupMsgGetSimpleResponse;

/**
 * 拉取群漫游消息
 * https://www.qcloud.com/document/product/269/2738
 * @since 2017年3月5日
 * @author kalman03
 */
public class GroupMsgGetSimpleRequest extends
		AbstractQCloudIMRequest<GroupMsgGetSimpleResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 必填	要拉取漫游消息的群组Id。
	 */
	private String groupId;
	/**
	 * 必填	拉取的漫游消息的条数，目前一次请求最多返回20条漫游消息，所以这里最好小于等于20。
	 */
	private int reqMsgNumber;
	/**
	 * 选填	拉取消息的最大seq。
	 */
	private Integer reqMsgSeq;

	@Override
	public String getApiName() {
		return "group_open_http_svc/group_msg_get_simple";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("ReqMsgNumber", reqMsgNumber);
		map.put("ReqMsgSeq", reqMsgSeq);
		return map;
	}

	@Override
	public Class<GroupMsgGetSimpleResponse> getResponseClass() {
		return GroupMsgGetSimpleResponse.class;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public int getReqMsgNumber() {
		return reqMsgNumber;
	}

	public void setReqMsgNumber(int reqMsgNumber) {
		this.reqMsgNumber = reqMsgNumber;
	}

	public Integer getReqMsgSeq() {
		return reqMsgSeq;
	}

	public void setReqMsgSeq(Integer reqMsgSeq) {
		this.reqMsgSeq = reqMsgSeq;
	}

}
