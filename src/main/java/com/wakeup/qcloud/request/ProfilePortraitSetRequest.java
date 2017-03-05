package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.ProfileItemDO;
import com.wakeup.qcloud.response.ProfilePortraitSetResponse;

/**
 * 设置资料
https://www.qcloud.com/document/product/269/1640
 * @since 2017年3月4日
 * @author kalman03
 */
public class ProfilePortraitSetRequest extends AbstractQCloudIMRequest<ProfilePortraitSetResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 	必填	需要设置该Identifier的资料。
	 */
	private String fromAccount;
	/**
	 * 待设置的用户的资料对象数组，数组中每一个对象都包含了Tag和Value
	 */
	private List<ProfileItemDO> profileItems;
		   
	@Override
	public String getApiName() {
		return "profile/portrait_set";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("From_Account", fromAccount);
		map.put("ProfileItem", profileItems);
		return map;
	}

	@Override
	public Class<ProfilePortraitSetResponse> getResponseClass() {
		return ProfilePortraitSetResponse.class;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public List<ProfileItemDO> getProfileItems() {
		return profileItems;
	}

	public void setProfileItems(List<ProfileItemDO> profileItems) {
		this.profileItems = profileItems;
	}
}
