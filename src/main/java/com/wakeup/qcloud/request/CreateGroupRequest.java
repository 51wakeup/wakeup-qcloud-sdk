package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.constant.ApplyJoinOption;
import com.wakeup.qcloud.constant.GroupType;
import com.wakeup.qcloud.domain.AppDefinedDataDO;
import com.wakeup.qcloud.domain.GroupMemberDO;
import com.wakeup.qcloud.response.CreateGroupResponse;

/**
 * APP管理员可以通过该接口创建群组。
 * 
 * <pre>
 * 云通信中内置了私有群、公开群、聊天室和互动直播聊天室四种群组类型，详情请见群组形态介绍，其中：
 * 
 * 私有群、公开群、聊天室和互动直播聊天室全部支持使用本REST AP创建新的群组；
 * 特别的，创建互动直播聊天室时不能拉人入群，如果创建时指定了拉入的群成员会返回10007错误。
 * 用户加入互动直播聊天室的唯一方式是用户申请加群。
 * </Pre>
 * 
 * @since 2017年2月20日
 * @author kalman03
 */
public class CreateGroupRequest extends
		AbstractQCloudIMRequest<CreateGroupResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 群主的UserId（选填） 群主id，自动添加到群成员中。如果不填，群没有群主。
	 */
	private String ownerAccount;
	/**
	 * {@link GroupType}
	 * ,群组形态，包括Public（公开群），Private（私密群），ChatRoom（聊天室），AVChatRoom（互动直播聊天室）。
	 */
	private String type;
	/**
	 * 用户自定义群组ID（选填）为了使得群组ID更加简单，便于记忆传播，腾讯云支持APP在通过REST
	 * API创建群组时自定义群组ID。详情参见：自定义群组ID。
	 */
	private String groupId;
	/**
	 * 群名称（必填）最长30字节。
	 */
	private String name;
	/**
	 * 群简介（选填）最长240字节
	 */
	private String introduction;
	/**
	 * 群公告（选填）最长300字节
	 */
	private String notification;
	/**
	 * 群头像URL（选填）最长100字节
	 */
	private String faceUrl;
	/**
	 * 最大群成员数量（选填）最大为10000，不填默认为2000个。
	 */
	private Long maxMemberCount;
	/**
	 * {@link ApplyJoinOption}
	 * 申请加群处理方式（选填）包含FreeAccess（自由加入），NeedPermission（需要验证），DisableApply（禁止加群），
	 * 不填默认为NeedPermission（需要验证）
	 */
	private String applyJoinOption = ApplyJoinOption.FreeAccess;
	/**
	 * 群组维度的自定义字段（选填）
	 */
	private List<AppDefinedDataDO> appDefinedData;
	/**
	 * 初始群成员列表，最多500个（选填）默认情况是没有的，需要开通，详情参见：自定义字段。
	 */
	private List<GroupMemberDO> memberList;

	@Override
	public String getApiName() {
		return "group_open_http_svc/create_group";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("Owner_Account", ownerAccount);
		map.put("Type", type);
		map.put("GroupId", groupId);
		map.put("Name", name);
		map.put("Introduction", introduction);
		map.put("Notification", notification);
		map.put("FaceUrl", faceUrl);
		map.put("MaxMemberCount", maxMemberCount);
		map.put("ApplyJoinOption", applyJoinOption);
		map.put("AppDefinedData", appDefinedData);
		map.put("MemberList", memberList);
		return map;
	}

	@Override
	public Class<CreateGroupResponse> getResponseClass() {
		return CreateGroupResponse.class;
	}

	public String getOwnerAccount() {
		return ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getNotification() {
		return notification;
	}

	public void setNotification(String notification) {
		this.notification = notification;
	}

	public String getFaceUrl() {
		return faceUrl;
	}

	public void setFaceUrl(String faceUrl) {
		this.faceUrl = faceUrl;
	}

	public Long getMaxMemberCount() {
		return maxMemberCount;
	}

	public void setMaxMemberCount(Long maxMemberCount) {
		this.maxMemberCount = maxMemberCount;
	}

	public String getApplyJoinOption() {
		return applyJoinOption;
	}

	public void setApplyJoinOption(String applyJoinOption) {
		this.applyJoinOption = applyJoinOption;
	}

	public List<AppDefinedDataDO> getAppDefinedData() {
		return appDefinedData;
	}

	public void setAppDefinedData(List<AppDefinedDataDO> appDefinedData) {
		this.appDefinedData = appDefinedData;
	}

	public List<GroupMemberDO> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<GroupMemberDO> memberList) {
		this.memberList = memberList;
	}
}
