package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.DirtyWordsGetResponse;

/**
 * 查询APP自定义脏字
 * https://www.qcloud.com/document/product/269/2396
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class DirtyWordsGetRequest extends AbstractQCloudIMRequest<DirtyWordsGetResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	@Override
	public String getApiName() {
		return "openim_dirty_words/get";
	}

	@Override
	public Map<String, Object> getTextParams() {
		return newHashMap();
	}

	@Override
	public Class<DirtyWordsGetResponse> getResponseClass() {
		return DirtyWordsGetResponse.class;
	}

}
