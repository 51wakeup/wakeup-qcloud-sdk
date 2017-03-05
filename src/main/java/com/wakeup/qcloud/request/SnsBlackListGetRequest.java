package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.SnsBlackListGetResponse;

/**
 * 拉取黑名单
 * https://www.qcloud.com/document/product/269/3722
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsBlackListGetRequest extends AbstractQCloudIMRequest<SnsBlackListGetResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 *必填	需要拉取该Identifier的黑名单。
	 */
	private String fromAccount;
	/**
	 * 必填	拉取的起始位置。
	 */
	private int startIndex;
	/**
	 * 选填	每页最多拉取的黑名单数。
	 */
	private Integer maxLimited;
	/**
	 * 必填	上一次拉黑名单时后台返回给客户端的Seq。
	 */
	private long lastSequence;
	
	@Override
	public String getApiName() {
		return "sns/black_list_get";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("From_Account", fromAccount);
		map.put("StartIndex", startIndex);
		map.put("MaxLimited", maxLimited);
		map.put("LastSequence", lastSequence);
		return map;
	}

	@Override
	public Class<SnsBlackListGetResponse> getResponseClass() {
		return SnsBlackListGetResponse.class;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getMaxLimited() {
		return maxLimited;
	}

	public void setMaxLimited(Integer maxLimited) {
		this.maxLimited = maxLimited;
	}

	public long getLastSequence() {
		return lastSequence;
	}

	public void setLastSequence(long lastSequence) {
		this.lastSequence = lastSequence;
	}

}
