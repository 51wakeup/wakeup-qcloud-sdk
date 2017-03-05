package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class GetRoleInGroupResponse extends QCloudIMResponse{

	private static final long serialVersionUID = 1095980905089249771L;
	/**
	 * 拉取到的成员在群内的身份信息，可能的身份包括Owner/Admin/Member/NotMember。
	 */
	@JSONField(name="UserIdList")
	private List<UserIdList> userIdList;
	
	public static class UserIdList extends BaseDO{
		/**
		 * 
		 */
		private static final long serialVersionUID = 7382213573495927178L;
		@JSONField(name="Member_Account")
		private String memberAccount;
		/**
		 * 身份：Owner/Admin/Member/NotMember
		 */
		@JSONField(name="Role")
		private String role;
		public String getMemberAccount() {
			return memberAccount;
		}
		public void setMemberAccount(String memberAccount) {
			this.memberAccount = memberAccount;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
	}

	public List<UserIdList> getUserIdList() {
		return userIdList;
	}

	public void setUserIdList(List<UserIdList> userIdList) {
		this.userIdList = userIdList;
	}

}
