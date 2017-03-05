package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.AddFriendItemDO;
import com.wakeup.qcloud.response.SnsFriendResponse;

/**
 * 添加好友 https://www.qcloud.com/document/product/269/1643
 * 
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsFriendAddRequest extends AbstractQCloudIMRequest<SnsFriendResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 必填 需要为该Identifier添加好友。
	 */
	private String fromAccount;
	/**
	 * 必填 好友结构体对象。
	 */
	private List<AddFriendItemDO> addFriendItemList;
	/**
	 * 选填 加好友方式（默认双向加好友方式）： "Add_Type_Single"表示单向加好友； "Add_Type_Both"表示双向加好友。
	 */
	private String addType;
	/**
	 * 选填 管理员强制加好友标记：1表示强制加好友；0表示常规加好友方式。
	 */
	private Integer forceAddFlags;

	@Override
	public String getApiName() {
		return "sns/friend_add";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("From_Account", fromAccount);
		map.put("AddFriendItem", addFriendItemList);
		map.put("AddType", addType);
		map.put("ForceAddFlags", forceAddFlags);
		return map;
	}

	@Override
	public Class<SnsFriendResponse> getResponseClass() {
		return SnsFriendResponse.class;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public List<AddFriendItemDO> getAddFriendItemList() {
		return addFriendItemList;
	}

	public void setAddFriendItemList(List<AddFriendItemDO> addFriendItemList) {
		this.addFriendItemList = addFriendItemList;
	}

	public String getAddType() {
		return addType;
	}

	public void setAddType(String addType) {
		this.addType = addType;
	}

	public Integer getForceAddFlags() {
		return forceAddFlags;
	}

	public void setForceAddFlags(Integer forceAddFlags) {
		this.forceAddFlags = forceAddFlags;
	}
}
