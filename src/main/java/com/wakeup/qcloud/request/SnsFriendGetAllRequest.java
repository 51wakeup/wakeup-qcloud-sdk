package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.response.SnsFriendGetAllResponse;

/**
 * 拉取好友
 * https://www.qcloud.com/document/product/269/1647
 * 
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsFriendGetAllRequest extends AbstractQCloudIMRequest<SnsFriendGetAllResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 必填	需要拉取该Identifier的好友。
	 */
	private String fromAccount;
	/**
	 * 选填	上次拉取的时间戳，不填或为0时表示全量拉取。
	 */
	private Long timestamp;
	/**
	 * 必填	拉取的起始位置。
	 */
	private int startIndex;
	/**
	 * 选填	指定要拉取的资料字段及好友字段，标配资料字段参见标配资料字段，自定义资料字段参见自定义资料字段，标配好友字段参见标配好友字段，自定义好友字段参见自定义好友字段。
	 */
	private List<String> tagList;
	/**
	 * 选填	上次拉取标配关系链的Sequence，仅在只拉取标配关系链字段时有用。
	 */
	private Integer lastStandardSequence;
	/**
	 * 选填	每页需要拉取的数量，默认每页拉去100个好友。
	 */
	private int getCount = 100;

	@Override
	public String getApiName() {
		return "sns/friend_get_all";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("From_Account", fromAccount);
		map.put("TimeStamp", timestamp);
		map.put("StartIndex", startIndex);
		map.put("TagList", tagList);
		map.put("LastStandardSequence", lastStandardSequence);
		map.put("GetCount", getCount);
		return map;
	}

	@Override
	public Class<SnsFriendGetAllResponse> getResponseClass() {
		return SnsFriendGetAllResponse.class;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public List<String> getTagList() {
		return tagList;
	}

	public void setTagList(List<String> tagList) {
		this.tagList = tagList;
	}

	public Integer getLastStandardSequence() {
		return lastStandardSequence;
	}

	public void setLastStandardSequence(Integer lastStandardSequence) {
		this.lastStandardSequence = lastStandardSequence;
	}

	public int getGetCount() {
		return getCount;
	}

	public void setGetCount(int getCount) {
		this.getCount = getCount;
	}

}
