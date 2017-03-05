package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class GetGroupShuttedUinResponse extends QCloudIMResponse {

	private static final long serialVersionUID = 1095980905089249771L;

	@JSONField(name = "ShuttedUinList")
	private List<ShuttedUinList> shuttedUinList;

	public static class ShuttedUinList extends BaseDO{
		/**
		 * 
		 */
		private static final long serialVersionUID = -8881411841844783179L;
		/**
		 * 用户ID
		 */
		@JSONField(name = "Member_Account")
		private String memberAccount;
		/**
		 * 禁言到的时间（使用UTC时间）
		 */
		@JSONField(name = "ShuttedUntil")
		private long shuttedUntil;

		public String getMemberAccount() {
			return memberAccount;
		}

		public void setMemberAccount(String memberAccount) {
			this.memberAccount = memberAccount;
		}

		public long getShuttedUntil() {
			return shuttedUntil;
		}

		public void setShuttedUntil(long shuttedUntil) {
			this.shuttedUntil = shuttedUntil;
		}
	}
}
