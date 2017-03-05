package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class AddGroupMemberResponse extends QCloudIMResponse{

	private static final long serialVersionUID = 1095980905089249771L;
	
	@JSONField(name="MemberList")
	private List<AddMemberResult> memberList;
	
	public static class AddMemberResult extends BaseDO{
		/**
		 * 
		 */
		private static final long serialVersionUID = 313609112307711108L;
		@JSONField(name="Member_Account")
		private String memberAccount;
		/**
		 * 加人结果：0-失败；1-成功；2-已经是群成员；3-等待被邀请者确认。
		 */
		@JSONField(name="Result")
		private int result;
		public String getMemberAccount() {
			return memberAccount;
		}
		public void setMemberAccount(String memberAccount) {
			this.memberAccount = memberAccount;
		}
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
	}

	public List<AddMemberResult> getMemberList() {
		return memberList;
	}

	public void setMemberList(List<AddMemberResult> memberList) {
		this.memberList = memberList;
	}

}
