package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.constant.IMMsgType;

/**
 * @since 2017年2月27日
 * @author kalman03
 */
public class FileMsgContentDO extends IMMsgContentDO {

	private static final long serialVersionUID = 4934057230215854678L;

	@Override
	public String getMsgType() {
		return IMMsgType.TIMFileElem;
	}
	/**
	 * 文件序列号。后台用于索引语音的键值。
	 */
	@JSONField(name = "UUID")
	private String uuid;
	/**
	 * 文件数据大小。
	 */
	@JSONField(name = "FileSize")
	private long fileSize;
	/**
	 * 文件名称。
	 */
	@JSONField(name = "FileName")
	private String fileName;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
