package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.UserTagDO;
import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 管理员给用户添加标签。注意每次最多只能给500个用户添加标签。目前公测阶段，暂无限制。但不排除以后会限制应用标签总数、单用户标签数。
 * https://www.qcloud.com/document/product/269/4128
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMAddTagRequest extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private List<UserTagDO> userTags;
	
	@Override
	public String getApiName() {
		return "openim/im_add_tag";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("UserTags", userTags);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

}
