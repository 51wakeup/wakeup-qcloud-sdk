package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;
import com.wakeup.qcloud.domain.IMMsgContentDO;

/**
 * @since 2017年3月5日
 * @author kalman03
 */
public class GroupMsgGetSimpleResponse extends QCloudIMResponse {

	private static final long serialVersionUID = 1095980905089249771L;

	@JSONField(name = "GroupId")
	private String groupId;
	@JSONField(name = "IsFinished")
	private int isFinished;

	@JSONField(name = "RspMsgList")
	private List<RspMsg> rspMsgList;

	public static class RspMsg extends BaseDO {
		private static final long serialVersionUID = 3478785428534423430L;
		@JSONField(name = "From_Account")
		private String fromAccount;
		@JSONField(name = "IsPlaceMsg")
		private int isPlaceMsg;
		/**
		 * {@link IMMsgContentDO} object extends IMMsgContentDO
		 */
		@JSONField(name = "MsgBody")
		private List<Object> msgBody;
		@JSONField(name = "MsgRandom")
		private long msgRandom;
		@JSONField(name = "MsgSeq")
		private long msgSeq;
		@JSONField(name = "MsgTimeStamp")
		private long msgTimeStamp;

		public String getFromAccount() {
			return fromAccount;
		}

		public void setFromAccount(String fromAccount) {
			this.fromAccount = fromAccount;
		}

		public int getIsPlaceMsg() {
			return isPlaceMsg;
		}

		public void setIsPlaceMsg(int isPlaceMsg) {
			this.isPlaceMsg = isPlaceMsg;
		}

		public List<Object> getMsgBody() {
			return msgBody;
		}

		public void setMsgBody(List<Object> msgBody) {
			this.msgBody = msgBody;
		}

		public long getMsgRandom() {
			return msgRandom;
		}

		public void setMsgRandom(long msgRandom) {
			this.msgRandom = msgRandom;
		}

		public long getMsgSeq() {
			return msgSeq;
		}

		public void setMsgSeq(long msgSeq) {
			this.msgSeq = msgSeq;
		}

		public long getMsgTimeStamp() {
			return msgTimeStamp;
		}

		public void setMsgTimeStamp(long msgTimeStamp) {
			this.msgTimeStamp = msgTimeStamp;
		}
	}

}
