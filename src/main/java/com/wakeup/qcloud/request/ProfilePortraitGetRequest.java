package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.wakeup.qcloud.constant.IMTagProfile;
import com.wakeup.qcloud.response.ProfilePortraitGetResponse;

/**
 * 拉取资料 https://www.qcloud.com/document/product/269/1639
 * 
 * @since 2017年3月4日
 * @author kalman03
 */
public class ProfilePortraitGetRequest extends
		AbstractQCloudIMRequest<ProfilePortraitGetResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 必填 需要拉取这些Identifier的资料
	 */
	private Set<String> toAccounts;
	/**
	 * {@link IMTagProfile} 必填
	 * 指定要拉取的资料对象的名称，支持标配资料和自定义资料的拉取，标配资料的相关信息参见：标配资料字段；自定义资料的相关信息参见：自定义资料字段。
	 */
	private Set<String> tagList;

	@Override
	public String getApiName() {
		return "profile/portrait_get";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("To_Account", toAccounts);
		map.put("TagList", tagList);
		return map;
	}

	@Override
	public Class<ProfilePortraitGetResponse> getResponseClass() {
		return ProfilePortraitGetResponse.class;
	}

	public Set<String> getToAccounts() {
		return toAccounts;
	}

	public void setToAccounts(Set<String> toAccounts) {
		this.toAccounts = toAccounts;
	}

	public Set<String> getTagList() {
		return tagList;
	}

	public void setTagList(Set<String> tagList) {
		this.tagList = tagList;
	}
}
