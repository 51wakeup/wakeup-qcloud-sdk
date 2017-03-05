package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.IMMsgContentDO;
import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 在群组中发送系统通知 https://www.qcloud.com/document/product/269/1630
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class SendGroupSystemNotificationRequest<A extends IMMsgContentDO>
		extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 必填 向哪个群组发送消息。
	 */
	private String groupId;
	/**
	 * 必填 系统通知的内容。
	 */
	private String content;
	/**
	 * 选填 接收者群成员列表，不填或为空表示全员下发。
	 */
	private List<String> toMembersAccount;

	@Override
	public String getApiName() {
		return "group_open_http_svc/send_group_system_notification";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("ToMembers_Account", toMembersAccount);
		map.put("Content", content);
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<String> getToMembersAccount() {
		return toMembersAccount;
	}

	public void setToMembersAccount(List<String> toMembersAccount) {
		this.toMembersAccount = toMembersAccount;
	}

}
