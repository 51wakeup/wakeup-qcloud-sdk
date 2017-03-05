package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.InfoItemDO;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsFriendGetAllResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;

	/**
	 * 是否需要全量更新："GetAll_Type_YES"表示需要全量更新，"GetAll_Type_NO"表示不需要全量更新。
	 */
	@JSONField(name = "NeedUpdateAll")
	private String needUpdateAll;
	/**
	 * 本次拉取的时间戳，客户端需要保存该时间，下次请求时通过TimeStamp字段返回给后台。
	 */
	@JSONField(name = "TimeStampNow")
	private long timeStampNow;
	/**
	 * 下页拉取的起始位置。
	 */
	@JSONField(name = "StartIndex")
	private int startIndex;

	/**
	 * 本次拉取标配关系链的Sequence，客户端需要保存该Sequence，下次请求时通过LastStandardSequence字段返回给后台。
	 */
	@JSONField(name = "CurrentStandardSequence")
	private int currentStandardSequence;
	/**
	 * 好友总数。
	 */
	@JSONField(name = "FriendNum")
	private int friendNum;
	/**
	 * 详细的客户端展示信息。
	 */
	@JSONField(name = "ErrorDisplay")
	private String errorDisplay;
	/**
	 * 好友对象数组，每一个好友对象都包括了Info_Account和SnsProfileItem。
	 */
	@JSONField(name = "InfoItem")
	private List<InfoItemDO> infoItem;

	public String getNeedUpdateAll() {
		return needUpdateAll;
	}

	public void setNeedUpdateAll(String needUpdateAll) {
		this.needUpdateAll = needUpdateAll;
	}

	public long getTimeStampNow() {
		return timeStampNow;
	}

	public void setTimeStampNow(long timeStampNow) {
		this.timeStampNow = timeStampNow;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getCurrentStandardSequence() {
		return currentStandardSequence;
	}

	public void setCurrentStandardSequence(int currentStandardSequence) {
		this.currentStandardSequence = currentStandardSequence;
	}

	public int getFriendNum() {
		return friendNum;
	}

	public void setFriendNum(int friendNum) {
		this.friendNum = friendNum;
	}

	public String getErrorDisplay() {
		return errorDisplay;
	}

	public void setErrorDisplay(String errorDisplay) {
		this.errorDisplay = errorDisplay;
	}

	public List<InfoItemDO> getInfoItem() {
		return infoItem;
	}

	public void setInfoItem(List<InfoItemDO> infoItem) {
		this.infoItem = infoItem;
	}
}
