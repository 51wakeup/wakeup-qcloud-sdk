package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class DirtyWordsGetResponse extends QCloudIMResponse{

	private static final long serialVersionUID = 1095980905089249771L;
	
	@JSONField(name="DirtyWordsList")
	private List<String> dirtyWordsList;

	public List<String> getDirtyWordsList() {
		return dirtyWordsList;
	}

	public void setDirtyWordsList(List<String> dirtyWordsList) {
		this.dirtyWordsList = dirtyWordsList;
	}

	

}
