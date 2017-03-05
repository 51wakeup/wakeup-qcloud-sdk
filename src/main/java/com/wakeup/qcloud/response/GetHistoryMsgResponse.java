package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;

/**
 * @since 2017年3月5日
 * @author kalman03
 */
public class GetHistoryMsgResponse extends QCloudIMResponse {

	private static final long serialVersionUID = 1095980905089249771L;
	@JSONField(name = "File")
	private List<MsgFile> fileList;

	public static class MsgFile extends BaseDO {

		private static final long serialVersionUID = 2986864067190678664L;
		/**
		 * 消息记录文件下载地址。
		 */
		@JSONField(name = "URL")
		private String url;
		/**
		 * 下载地址过期时间，请在过期前进行下载，若地址失效，请通过该接口重新获取。
		 */
		@JSONField(name = "ExpireTime")
		private String expireTime;
		@JSONField(name = "FileSize")
		private long fileSize;
		@JSONField(name = "FileMD5")
		private String fileMD5;
		@JSONField(name = "GzipSize")
		private String gzipSize;
		@JSONField(name = "GzipMD5")
		private String gzipMD5;

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getExpireTime() {
			return expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public long getFileSize() {
			return fileSize;
		}

		public void setFileSize(long fileSize) {
			this.fileSize = fileSize;
		}

		public String getFileMD5() {
			return fileMD5;
		}

		public void setFileMD5(String fileMD5) {
			this.fileMD5 = fileMD5;
		}

		public String getGzipSize() {
			return gzipSize;
		}

		public void setGzipSize(String gzipSize) {
			this.gzipSize = gzipSize;
		}

		public String getGzipMD5() {
			return gzipMD5;
		}

		public void setGzipMD5(String gzipMD5) {
			this.gzipMD5 = gzipMD5;
		}
	}

	public List<MsgFile> getFileList() {
		return fileList;
	}

	public void setFileList(List<MsgFile> fileList) {
		this.fileList = fileList;
	}

}
