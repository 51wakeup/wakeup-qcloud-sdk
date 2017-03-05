package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.AddFriendItemDO;
import com.wakeup.qcloud.response.SnsFriendResponse;

/**
 * 导入好友
 * https://www.qcloud.com/document/product/269/8301
 * 
 * @since 2017年3月4日
 * @author kalman03
 */
public class SnsFriendImportRequest extends AbstractQCloudIMRequest<SnsFriendResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 必填 需要为该Identifier添加好友。
	 */
	private String fromAccount;
	/**
	 * 必填 好友结构体对象。
	 */
	private List<AddFriendItemDO> addFriendItemList;
	

	@Override
	public String getApiName() {
		return "sns/friend_import";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("From_Account", fromAccount);
		map.put("AddFriendItem", addFriendItemList);
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

}
