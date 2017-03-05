package com.wakeup.qcloud.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年3月4日
 * @author kalman03
 */
public class AddFriendItemDO extends BaseDO {

	private static final long serialVersionUID = 8794724660144963988L;
	/**
	 * 必填 好友的Identifier。
	 */
	@JSONField(name = "To_Account")
	private String toAccount;
	/**
	 * 选填 From_Account对To_Account的好友备注，详情可参见标配好友字段。
	 */
	@JSONField(name = "Remark")
	private String remark;
	/**
	 * 
	 */
	@JSONField(name = "RemarkTime")
	private Long remarkTime;
	/**
	 * 必填 加好友来源字段，详情可参见标配好友字段。
	 */
	@JSONField(name = "AddSource")
	private String addSource;

	/**
	 * 选填 From_Account对To_Account的分组信息，详情可参见标配好友字段。
	 */
	@JSONField(name = "GroupName")
	private List<String> groupName;
	/**
	 * 选填 From_Account和To_Account形成好友关系时的附言信息，详情可参见标配好友字段。
	 */
	@JSONField(name = "AddWording")
	private String addWording;
	/**
	 * 选填 From_Account和To_Account形成好友关系的时间。
	 */
	@JSONField(name = "AddTime")
	private Long addTime;
	/**
	 * 选填 From_Account对To_Account的自定义表示对象信息数组，每一个对象都包含了Tag和Value。
	 */
	@JSONField(name = "CustomItem")
	private List<ProfileItemDO> customItem;

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getRemarkTime() {
		return remarkTime;
	}

	public void setRemarkTime(Long remarkTime) {
		this.remarkTime = remarkTime;
	}

	public String getAddSource() {
		return addSource;
	}

	public void setAddSource(String addSource) {
		this.addSource = addSource;
	}

	public List<String> getGroupName() {
		return groupName;
	}

	public void setGroupName(List<String> groupName) {
		this.groupName = groupName;
	}

	public String getAddWording() {
		return addWording;
	}

	public void setAddWording(String addWording) {
		this.addWording = addWording;
	}

	public Long getAddTime() {
		return addTime;
	}

	public void setAddTime(Long addTime) {
		this.addTime = addTime;
	}

	public List<ProfileItemDO> getCustomItem() {
		return customItem;
	}

	public void setCustomItem(List<ProfileItemDO> customItem) {
		this.customItem = customItem;
	}
}
