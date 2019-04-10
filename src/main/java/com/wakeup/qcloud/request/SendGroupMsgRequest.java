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
 * 在群组中发送普通消息
 * https://www.qcloud.com/document/product/269/1629
 * @since 2017年3月5日
 * @author kalman03
 */
public class SendGroupMsgRequest extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 *必填	向哪个群组发送消息。
	 */
	private String groupId;
	/**
	 * 选填	消息来源帐号，选填。如果不填写该字段，则默认消息的发送者为调用该接口时使用的APP管理员帐号。除此之外，APP亦可通过该字段“伪造”消息的发送者，从而实现一些特殊的功能需求。需要注意的是，如果指定该字段，必须要确保字段中的帐号是存在的。
	 */
	private String fromAccount;
	/**
	 * 消息，必须
	 */
	private List<? extends IMMsgContentDO> msgList;
	/**
	 * 选填	离线推送信息配置，具体可参考消息格式描述。
	 */
	private OfflinePushInfoDO offlinePushInfoDO;
	/**
	 * 选填	消息回调禁止开关，只对单条消息有效，ForbidBeforeSendMsgCallback表示禁止发消息前回调，ForbidAfterSendMsgCallback表示禁止发消息后回调。
	 */
	private List<String> forbidCallbackControl;
	/**
	 * 选填	消息的优先级。从高到低依次为High，Normal，Low，Lowest，区分大小写
	 */
	private String msgPriority;

	@Override
	public String getApiName() {
		return "group_open_http_svc/send_group_msg";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("Random", RandomUtil.getRandomNumber(7,true));
		map.put("MsgPriority", msgPriority);
		List<Map<String, Object>> msgBody = newArrayList();
		for (IMMsgContentDO contentDO : msgList) {
			Map<String, Object> innerMap = newHashMap();
			innerMap.put("MsgType", contentDO.getMsgType());
			innerMap.put("MsgContent", contentDO);
			msgBody.add(innerMap);
		}
		map.put("MsgBody", msgBody);
		if (isNotBlank(fromAccount)) {
			map.put("From_Account", fromAccount);
		}
		if(offlinePushInfoDO != null){
			map.put("OfflinePushInfo", offlinePushInfoDO);
		}
		map.put("ForbidCallbackControl", forbidCallbackControl);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
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

	public List<String> getForbidCallbackControl() {
		return forbidCallbackControl;
	}

	public void setForbidCallbackControl(List<String> forbidCallbackControl) {
		this.forbidCallbackControl = forbidCallbackControl;
	}

	public String getMsgPriority() {
		return msgPriority;
	}

	public void setMsgPriority(String msgPriority) {
		this.msgPriority = msgPriority;
	}

	public List<? extends IMMsgContentDO> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<? extends IMMsgContentDO> msgList) {
		this.msgList = msgList;
	}
}
