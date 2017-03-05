package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.wakeup.qcloud.response.QCloudIMResponse;

/**
 * 删除APP自定义脏字
 * https://www.qcloud.com/document/product/269/2398
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class DirtyWordsDeleteRequest extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	private Set<String> dirtyWords;
	
	@Override
	public String getApiName() {
		return "openim_dirty_words/delete";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("DirtyWordsList", dirtyWords);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

	public Set<String> getDirtyWords() {
		return dirtyWords;
	}

	public void setDirtyWords(Set<String> dirtyWords) {
		this.dirtyWords = dirtyWords;
	}
}
