package com.wakeup.qcloud.listener;

import java.util.List;

import com.wakeup.qcloud.domain.BaseDO;
import com.wakeup.qcloud.domain.IMMsgBody;
import com.wakeup.qcloud.domain.IMMsgContentDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class GroupCallbackSendMsgReq extends BaseDO {

	private static final long serialVersionUID = 8409073556117158334L;
	private String callbackCommand;
	private String groupId;
	private String type;
	private String fromAccount;
	private String operatorAccount;
	private long random;
	private List<IMMsgBody<? extends IMMsgContentDO>> msgBody;

	public String getCallbackCommand() {
		return callbackCommand;
	}

	public void setCallbackCommand(String callbackCommand) {
		this.callbackCommand = callbackCommand;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getOperatorAccount() {
		return operatorAccount;
	}

	public void setOperatorAccount(String operatorAccount) {
		this.operatorAccount = operatorAccount;
	}

	public long getRandom() {
		return random;
	}

	public void setRandom(long random) {
		this.random = random;
	}

	public List<IMMsgBody<? extends IMMsgContentDO>> getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(List<IMMsgBody<? extends IMMsgContentDO>> msgBody) {
		this.msgBody = msgBody;
	}

}