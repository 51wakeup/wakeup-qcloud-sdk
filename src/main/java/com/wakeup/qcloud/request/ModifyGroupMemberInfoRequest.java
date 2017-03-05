package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.AppDefinedDataDO;
import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 修改群成员资料
 *https://www.qcloud.com/document/product/269/1623
 * @since 2017年3月5日
 * @author kalman03
 */
public class ModifyGroupMemberInfoRequest extends
		AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = 9197076482321160595L;
	/**
	 * 必填	操作的群ID。
	 */
	private String groupId;
	/**
	 * 必填	要操作的群成员。
	 */
	private String memberAccount;
	/**
	 * 选填	成员身份，Admin/Member分别为设置/取消管理员。
	 */
	private String role;
	/**
	 * 选填	消息屏蔽类型。 AcceptAndNotify代表解收并提示消息，Discard代表不接收也不提示消息，AcceptNotNotify代表接收消息但不提示。
	 */
	private String msgFlag;
	
	/**
	 * 选填	群名片（最大不超过50个字节）。
	 */
	private String nameCard;
	/**
	 * 选填	群成员维度的自定义字段，默认情况是没有的，需要开通
	 */
	private List<AppDefinedDataDO> appDefinedData;

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("Member_Account", memberAccount);
		map.put("Role", role);
		map.put("MsgFlag", msgFlag);
		map.put("NameCard", nameCard);
		map.put("AppMemberDefinedData", appDefinedData);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

	@Override
	public String getApiName() {
		return "group_open_http_svc/modify_group_member_info";
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMsgFlag() {
		return msgFlag;
	}

	public void setMsgFlag(String msgFlag) {
		this.msgFlag = msgFlag;
	}

	public String getNameCard() {
		return nameCard;
	}

	public void setNameCard(String nameCard) {
		this.nameCard = nameCard;
	}

	public List<AppDefinedDataDO> getAppDefinedData() {
		return appDefinedData;
	}

	public void setAppDefinedData(List<AppDefinedDataDO> appDefinedData) {
		this.appDefinedData = appDefinedData;
	}

}
