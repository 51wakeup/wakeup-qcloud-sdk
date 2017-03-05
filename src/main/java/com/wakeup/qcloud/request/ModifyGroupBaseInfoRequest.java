package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.constant.ApplyJoinOption;
import com.wakeup.qcloud.domain.AppDefinedDataDO;
import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class ModifyGroupBaseInfoRequest extends
		AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = 9197076482321160595L;
	/**
	 * 要修改哪个群的基础资料（必填）
	 */
	private String groupId;
	/**
	 * 群名称，最长30字节。（选填）
	 */
	private String name;
	/**
	 * 群简介，最长240字节。（选填）
	 */
	private String introduction;
	/**
	 * 群公告，最长300字节。（选填）
	 */
	private String notification;
	/**
	 * 群头像URL，最长100字节。
	 */
	private String faceUrl;
	/**
	 * 最大群成员数量，最大为10000。（选填）
	 */
	private Integer maxMemberNum;
	/**
	 * {@link ApplyJoinOption} 申请加群方式（选填）
	 */
	private String applyJoinOption;
	/**
	 * 群组维度的自定义字段（选填）
	 */
	private List<AppDefinedDataDO> appDefinedData;

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("GroupId", groupId);
		map.put("Name", name);
		map.put("Introduction", introduction);
		map.put("Notification", notification);
		map.put("FaceUrl", faceUrl);
		map.put("MaxMemberNum", maxMemberNum);
		map.put("ApplyJoinOption", applyJoinOption);
		map.put("AppDefinedData", appDefinedData);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

	@Override
	public String getApiName() {
		return "group_open_http_svc/modify_group_base_info";
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

	public Integer getMaxMemberNum() {
		return maxMemberNum;
	}

	public void setMaxMemberNum(Integer maxMemberNum) {
		this.maxMemberNum = maxMemberNum;
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

}
