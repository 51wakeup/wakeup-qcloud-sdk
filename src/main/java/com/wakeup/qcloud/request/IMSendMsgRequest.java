package com.wakeup.qcloud.request;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.IMMsgContentDO;
import com.wakeup.qcloud.domain.OfflinePushInfoDO;
import com.wakeup.qcloud.response.QCloudIMResponse;
import com.wakeup.qcloud.utils.RandomUtil;

/**
 * 单发单聊消息
 * 
 * @since 2017年2月20日
 * @author kalman03
 * @param <T>
 */
public class IMSendMsgRequest extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 消息是否同步至发送方
	 */
	private boolean syncOtherMachine = true;

	/**
	 * 消息接收方账号，必填
	 */
	private String toAccount;
	/**
	 * 消息发送方账号。（用于指定发送消息方账号）,选填
	 */
	private String fromAccount;
	/**
	 * 消息，必须
	 */
	private List<? extends IMMsgContentDO> msgList;
	/**
	 * OfflinePushInfo是专用于离线推送配置的Json对象，允许配置该条消息是否关闭推送、推送文本描述内容、推送透传字符串等等。使用OfflinePushInfo可以方便地设置离线推送信息，无需再通过TIMCustomElem封装实现。注意：如果填写了OfflinePushInfo，那么TIMCustomElem中与离线推送有关的信息配置会被忽略。目前OfflinePushInfo仅适用于APNs推送，不适用于安卓厂商推送（小米、华为推送）。
	 */
	private OfflinePushInfoDO offlinePushInfoDO;

	@Override
	public String getApiName() {
		return "openim/sendmsg";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("SyncOtherMachine", syncOtherMachine ? 1 : 2);
		map.put("To_Account", toAccount);
		List<Map<String, Object>> msgBody = newArrayList();
		for (IMMsgContentDO contentDO : msgList) {
			Map<String, Object> innerMap = newHashMap();
			innerMap.put("MsgType", contentDO.getMsgType());
			innerMap.put("MsgContent", contentDO);
			msgBody.add(innerMap);
		}
		map.put("MsgBody", msgBody);
		map.put("MsgRandom", RandomUtil.getRandomNumber(7,true));
		map.put("MsgTimeStamp", System.currentTimeMillis()/1000);
		if (isNotBlank(fromAccount)) {
			map.put("From_Account", fromAccount);
		}
		if(offlinePushInfoDO != null){
			map.put("OfflinePushInfo", offlinePushInfoDO);
		}
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

	public boolean isSyncOtherMachine() {
		return syncOtherMachine;
	}

	public void setSyncOtherMachine(boolean syncOtherMachine) {
		this.syncOtherMachine = syncOtherMachine;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public OfflinePushInfoDO getOfflinePushInfoDO() {
		return offlinePushInfoDO;
	}

	public void setOfflinePushInfoDO(OfflinePushInfoDO offlinePushInfoDO) {
		this.offlinePushInfoDO = offlinePushInfoDO;
	}

	public List<? extends IMMsgContentDO> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<? extends IMMsgContentDO> msgList) {
		this.msgList = msgList;
	}

}
