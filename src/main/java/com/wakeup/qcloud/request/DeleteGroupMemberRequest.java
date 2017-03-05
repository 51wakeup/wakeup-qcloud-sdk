package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 删除群组成员
 * https://www.qcloud.com/document/product/269/1622
 * @since 2017年3月5日
 * @author kalman03
 */
public class DeleteGroupMemberRequest extends
		AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -2346144189397213598L;
	private String groupId;
	/**
	 * 必填	待删除的群成员。
	 */
	private List<String> memberToDelAccounts;
	/**
	 * 选填	是否静默删人。0：非静默删人；1：静默删人。不填该字段默认为0。
	 */
	private int silence = 0 ;
	/**
	 * 选填	踢出用户原因。
	 */
	private String reason;

	@Override
	public String getApiName() {
		return "group_open_http_svc/delete_group_member";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("Silence", silence);
		map.put("reason", reason);
		map.put("MemberToDel_Account", memberToDelAccounts);
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

	public List<String> getMemberToDelAccounts() {
		return memberToDelAccounts;
	}

	public void setMemberToDelAccounts(List<String> memberToDelAccounts) {
		this.memberToDelAccounts = memberToDelAccounts;
	}

	public int getSilence() {
		return silence;
	}

	public void setSilence(int silence) {
		this.silence = silence;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
