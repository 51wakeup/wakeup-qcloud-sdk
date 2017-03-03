package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.GroupIdDO;

/**
 * @since 2017年2月21日
 * @author kalman03
 */
public class GetAppidGroupListResponse extends QCloudIMResponse {

	private static final long serialVersionUID = -1348396171308451248L;
	/**
	 * 获取到的群组ID的集合。
	 */
	@JSONField(name = "GroupIdList")
	private List<GroupIdDO> groupIdList;
	/**
	 * APP当前的群组总数。如果仅需要返回特定群组形态的群组，可以通过GroupType进行过滤，
	 * 但此时返回的TotalCount的含义就变成了APP中该群组形态的群组总数。
	 * 例如：假设APP旗下总共50000个群组，其中有20000个为公开群组
	 * ，如果将请求包体中的GroupType设置为Public，那么不论Limit和Offset怎样设置
	 * ，应答包体中的TotalCount都为20000，且GroupIdList中的群组全部为公开群组。
	 */
	@JSONField(name = "TotalCount")
	private int totalCount;
	/**
	 * 分页拉取的标志。
	 */
	@JSONField(name = "Next")
	private long next;

	public List<GroupIdDO> getGroupIdList() {
		return groupIdList;
	}

	public void setGroupIdList(List<GroupIdDO> groupIdList) {
		this.groupIdList = groupIdList;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public long getNext() {
		return next;
	}

	public void setNext(long next) {
		this.next = next;
	}
}
