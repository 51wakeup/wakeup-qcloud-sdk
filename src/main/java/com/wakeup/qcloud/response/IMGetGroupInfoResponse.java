package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.GroupInfoDO;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class IMGetGroupInfoResponse extends QCloudIMResponse{

	private static final long serialVersionUID = 1095980905089249771L;
	
	@JSONField(name="GroupInfo")
	private List<GroupInfoDO> groupInfo;

	public List<GroupInfoDO> getGroupInfo() {
		return groupInfo;
	}

	public void setGroupInfo(List<GroupInfoDO> groupInfo) {
		this.groupInfo = groupInfo;
	}
}
