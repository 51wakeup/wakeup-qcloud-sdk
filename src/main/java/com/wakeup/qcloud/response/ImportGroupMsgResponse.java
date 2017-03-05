package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;

/**
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class ImportGroupMsgResponse extends QCloudIMResponse {

	private static final long serialVersionUID = 1095980905089249771L;

	@JSONField(name = "ImportMsgResult")
	private List<ImportMsgResult> importMsgResult;

	public static class ImportMsgResult extends BaseDO{
		private static final long serialVersionUID = -6056511372581458874L;
		/**
		 * 单条消息导入结果。
		 */
		@JSONField(name="Result")
		private int result;
		/**
		 * 给消息分配的seq。
		 */
		@JSONField(name="MsgSeq")
		private int msgSeq;
		/**
		 * 消息的时间戳。
		 */
		@JSONField(name="MsgTime")
		private long msgTime;
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		public int getMsgSeq() {
			return msgSeq;
		}
		public void setMsgSeq(int msgSeq) {
			this.msgSeq = msgSeq;
		}
		public long getMsgTime() {
			return msgTime;
		}
		public void setMsgTime(long msgTime) {
			this.msgTime = msgTime;
		}
	}

	public List<ImportMsgResult> getImportMsgResult() {
		return importMsgResult;
	}

	public void setImportMsgResult(List<ImportMsgResult> importMsgResult) {
		this.importMsgResult = importMsgResult;
	}
}
