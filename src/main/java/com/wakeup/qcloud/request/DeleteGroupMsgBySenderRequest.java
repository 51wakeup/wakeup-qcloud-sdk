package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 删除指定用户发送的消息
 * https://www.qcloud.com/document/product/269/2359
 * @since 2017年3月5日
 * @author kalman03
 */
public class DeleteGroupMsgBySenderRequest extends
		AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 必填	要删除消息的群ID。
	 */
	private String groupId;
	/**
	 * 必填	被删除消息的发送者ID。
	 */
	private String senderAccount;
	
	
	@Override
	public String getApiName() {
		return "group_open_http_svc/delete_group_msg_by_sender";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("Sender_Account", senderAccount);
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

	public String getSenderAccount() {
		return senderAccount;
	}

	public void setSenderAccount(String senderAccount) {
		this.senderAccount = senderAccount;
	}

}
