package com.wakeup.qcloud.listener;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.IMMsgBody;
import com.wakeup.qcloud.domain.IMMsgContentDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class GroupCallbackBeforeSendMsgResp extends IMMsgResponse{

	private static final long serialVersionUID = -5709855705114854713L;
	@JSONField(name = "MsgBody")
	private List<IMMsgBody<? extends IMMsgContentDO>> msgBody;

	public List<IMMsgBody<? extends IMMsgContentDO>> getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(List<IMMsgBody<? extends IMMsgContentDO>> msgBody) {
		this.msgBody = msgBody;
	}
}
