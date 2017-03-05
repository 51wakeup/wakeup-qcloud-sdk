package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 设置成员未读消息计数 https://www.qcloud.com/document/product/269/1637
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class SetUnreadMsgNumRequest extends
		AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private String groupId;

	private String memberAccount;

	private int unreadMsgNum;

	@Override
	public String getApiName() {
		return "group_open_http_svc/set_unread_msg_num";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("Member_Account", memberAccount);
		map.put("UnreadMsgNum", unreadMsgNum);
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

	public String getMemberAccount() {
		return memberAccount;
	}

	public void setMemberAccount(String memberAccount) {
		this.memberAccount = memberAccount;
	}

	public int getUnreadMsgNum() {
		return unreadMsgNum;
	}

	public void setUnreadMsgNum(int unreadMsgNum) {
		this.unreadMsgNum = unreadMsgNum;
	}

}
