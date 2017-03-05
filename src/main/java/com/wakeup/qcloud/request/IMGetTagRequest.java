package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.response.IMGetTagResponse;

/**
 * 获取用户标签 https://www.qcloud.com/document/product/269/4130
 * 
 * @since 2017年3月4日
 * @author kalman03
 */
public class IMGetTagRequest extends AbstractQCloudIMRequest<IMGetTagResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 目标用户帐号列表。
	 */
	private List<String> toAccounts;

	@Override
	public String getApiName() {
		return "openim/im_get_tag";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("To_Account", toAccounts);
		return map;
	}

	@Override
	public Class<IMGetTagResponse> getResponseClass() {
		return IMGetTagResponse.class;
	}

	public List<String> getToAccounts() {
		return toAccounts;
	}

	public void setToAccounts(List<String> toAccounts) {
		this.toAccounts = toAccounts;
	}

}
