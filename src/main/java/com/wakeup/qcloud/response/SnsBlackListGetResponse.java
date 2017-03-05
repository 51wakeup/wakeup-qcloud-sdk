package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BlackItemDO;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsBlackListGetResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -2311631562736465793L;
	/**
	 * 黑名单对象数组，每一个黑名单对象都包括了Black_Account和BlackTimeStamp。
	 */
	@JSONField(name = "BlackListItem")
	private List<BlackItemDO> blackItems;
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
	 * 详细的客户端展示信息。
	 */
	@JSONField(name = "ErrorDisplay")
	private String errorDisplay;
	public List<BlackItemDO> getBlackItems() {
		return blackItems;
	}
	public void setBlackItems(List<BlackItemDO> blackItems) {
		this.blackItems = blackItems;
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
	public String getErrorDisplay() {
		return errorDisplay;
	}
	public void setErrorDisplay(String errorDisplay) {
		this.errorDisplay = errorDisplay;
	}
	
}
