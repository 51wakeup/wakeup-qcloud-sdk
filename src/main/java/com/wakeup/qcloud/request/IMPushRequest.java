package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.IMMsgContentDO;
import com.wakeup.qcloud.domain.PushConditionDO;
import com.wakeup.qcloud.response.IMPushResponse;
import com.wakeup.qcloud.utils.RandomUtil;

/**
 * 推送
 * <pre>
 * ﻿功能说明

支持全员推送；
支持按用户属性推送；
支持按用户标签推送；
管理员向账号推送消息，接收方看到消息发送者是管理员；
管理员指定某一账户向其他账户推送消息，接收方看到发送者不是管理员，而是管理员指定的账号；
支持消息离线存储。
 * </pre>
 * https://www.qcloud.com/document/product/269/4123
 * @since 2017年3月4日
 * @author kalman03
 */
public class IMPushRequest<A extends IMMsgContentDO> extends AbstractQCloudIMRequest<IMPushResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 必填	消息内容
	 */
	private List<A> msgBody;
	/**
	 * 选填	消息离线存储时间，单位秒，最多7天。默认为0, 表示不离线存储。
	 */
	private long msgLifeTime =0;
	/**
	 * 选填	Condition包含TagsOr和TagsAnd两种属性条件类型。这两种可以类型可以并存。这时候表示同时满足TagsOr和TagsAnd的用户。如果没有Condition,则推送给全部用户。
	 */
	private PushConditionDO condition;
	/**
	 * 选填	消息推送方账号。
	 */
	private String fromAccount;
		   
	@Override
	public String getApiName() {
		return "openim/im_push";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("Condition", condition);
		map.put("MsgRandom", RandomUtil.getRandomNumber(7));
		map.put("MsgBody", msgBody);
		map.put("MsgLifeTime", msgLifeTime);
		map.put("From_Account", fromAccount);
		return map;
	}

	@Override
	public Class<IMPushResponse> getResponseClass() {
		return IMPushResponse.class;
	}

	public List<A> getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(List<A> msgBody) {
		this.msgBody = msgBody;
	}

	public long getMsgLifeTime() {
		return msgLifeTime;
	}

	public void setMsgLifeTime(long msgLifeTime) {
		this.msgLifeTime = msgLifeTime;
	}

	public PushConditionDO getCondition() {
		return condition;
	}

	public void setCondition(PushConditionDO condition) {
		this.condition = condition;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

}
