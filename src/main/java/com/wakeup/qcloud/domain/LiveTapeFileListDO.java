package com.wakeup.qcloud.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class LiveTapeFileListDO extends BaseDO {

	private static final long serialVersionUID = 650032581876133689L;
	/**
	 * 分片总个数
	 */
	@JSONField(name = "all_count")
	private int allCount;
	/**
	 * 分片文件信息
	 */
	@JSONField(name = "file_list")
	private List<LiveTapeFileDO> fileList;

	public int getAllCount() {
		return allCount;
	}

	public void setAllCount(int allCount) {
		this.allCount = allCount;
	}

	public List<LiveTapeFileDO> getFileList() {
		return fileList;
	}

	public void setFileList(List<LiveTapeFileDO> fileList) {
		this.fileList = fileList;
	}

}
