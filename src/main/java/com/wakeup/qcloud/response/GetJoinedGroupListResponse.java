package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;

/**
 * @since 2017年3月5日
 * @author kalman03
 */
public class GetJoinedGroupListResponse extends QCloudIMResponse {

	private static final long serialVersionUID = 1095980905089249771L;
	/**
	 * 不论Limit和Offset如何设置，该值总是满足条件的群组总数
	 */
	@JSONField(name = "TotalCount")
	private int totalCount;

	@JSONField(name = "GroupIdList")
	private List<GroupIdList> groupIdList;

	public static class GroupIdList extends BaseDO{
		
		private static final long serialVersionUID = -2701211271475164685L;
		@JSONField(name = "GroupId")
		private String groupId;
		@JSONField(name = "Type")
		private String type;
		@JSONField(name = "LastMsgTime")
		private long lastMsgTime;
		@JSONField(name = "MemberCount")
		private String memberCount;
		@JSONField(name = "SelfInfo")
		private SelfInfo selfInfo;

		public String getGroupId() {
			return groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public long getLastMsgTime() {
			return lastMsgTime;
		}

		public void setLastMsgTime(long lastMsgTime) {
			this.lastMsgTime = lastMsgTime;
		}

		public String getMemberCount() {
			return memberCount;
		}

		public void setMemberCount(String memberCount) {
			this.memberCount = memberCount;
		}

		public SelfInfo getSelfInfo() {
			return selfInfo;
		}

		public void setSelfInfo(SelfInfo selfInfo) {
			this.selfInfo = selfInfo;
		}
	}

	public static class SelfInfo {
		@JSONField(name = "Role")
		private String role;
		@JSONField(name = "MsgFlag")
		private String msgFlag;
		@JSONField(name = "UnreadMsgNum")
		private int unReadMsgNum;

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getMsgFlag() {
			return msgFlag;
		}

		public void setMsgFlag(String msgFlag) {
			this.msgFlag = msgFlag;
		}

		public int getUnReadMsgNum() {
			return unReadMsgNum;
		}

		public void setUnReadMsgNum(int unReadMsgNum) {
			this.unReadMsgNum = unReadMsgNum;
		}
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<GroupIdList> getGroupIdList() {
		return groupIdList;
	}

	public void setGroupIdList(List<GroupIdList> groupIdList) {
		this.groupIdList = groupIdList;
	}

}
