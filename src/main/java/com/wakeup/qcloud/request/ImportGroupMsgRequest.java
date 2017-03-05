package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.IMMsgContentDO;
import com.wakeup.qcloud.response.ImportGroupMsgResponse;

/**
 * 导入群消息 https://www.qcloud.com/document/product/269/1635
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class ImportGroupMsgRequest<E extends IMMsgContentDO> extends
		AbstractQCloudIMRequest<ImportGroupMsgResponse> {

	private static final long serialVersionUID = 9197076482321160595L;
	/**
	 * 必填 要导入消息的群ID。
	 */
	private String groupId;

	private List<MsgList<E>> msgList;

	public static class MsgList<S extends IMMsgContentDO> {
		/**
		 * 指定消息发送者
		 */
		@JSONField(name = "From_Account")
		private String fromAccount;

		@JSONField(name = "SendTime")
		private long sendTime;
		/**
		 * 消息随机数（可选）
		 */
		@JSONField(name = "Random")
		private Long random;
		@JSONField(name = "MsgBody")
		private List<S> msgBody;

		public String getFromAccount() {
			return fromAccount;
		}

		public void setFromAccount(String fromAccount) {
			this.fromAccount = fromAccount;
		}

		public Long getRandom() {
			return random;
		}

		public void setRandom(Long random) {
			this.random = random;
		}

		public List<S> getMsgBody() {
			return msgBody;
		}

		public void setMsgBody(List<S> msgBody) {
			this.msgBody = msgBody;
		}

		public long getSendTime() {
			return sendTime;
		}

		public void setSendTime(long sendTime) {
			this.sendTime = sendTime;
		}
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("MsgList", msgList);
		map.put("GroupId", groupId);
		return map;
	}

	@Override
	public Class<ImportGroupMsgResponse> getResponseClass() {
		return ImportGroupMsgResponse.class;
	}

	@Override
	public String getApiName() {
		return "group_open_http_svc/import_group_msg";
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public List<MsgList<E>> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<MsgList<E>> msgList) {
		this.msgList = msgList;
	}
}
