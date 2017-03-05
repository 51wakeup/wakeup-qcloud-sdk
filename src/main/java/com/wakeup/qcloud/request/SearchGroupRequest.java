package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;
import com.wakeup.qcloud.response.SearchGroupResponse;

/**
 * 模糊搜索群组
 * https://www.qcloud.com/document/product/269/2360
 * @since 2017年3月5日
 * @author kalman03
 */
public class SearchGroupRequest extends
		AbstractQCloudIMRequest<SearchGroupResponse> {

	private static final long serialVersionUID = -7973614575899011644L;
	/**
	 * 搜索关键字（目前只支持对群名称进行匹配）
	 */
	private String content;
	/**
	 * 选填	从第几页开始搜索。
	 */
	private Integer pageNum;
	/**
	 * 选填	每页有多少个群。
	 */
	private Integer groupPerPage;
	
	private ResponseFilter responseFilter;
	
	public static class ResponseFilter extends BaseDO{
		
		private static final long serialVersionUID = 381289934298186602L;
		@JSONField(name="GroupBasePublicInfoFilter")
		private Set<String> groupBasePublicInfoFilter;
		public Set<String> getGroupBasePublicInfoFilter() {
			return groupBasePublicInfoFilter;
		}
		public void setGroupBasePublicInfoFilter(Set<String> groupBasePublicInfoFilter) {
			this.groupBasePublicInfoFilter = groupBasePublicInfoFilter;
		}
		
	}
	@Override
	public String getApiName() {
		return "group_open_http_svc/search_group";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("Content", content);
		map.put("PageNum", pageNum);
		map.put("GroupPerPage",groupPerPage);
		map.put("ResponseFilter",responseFilter);
		return map;
	}

	@Override
	public Class<SearchGroupResponse> getResponseClass() {
		return SearchGroupResponse.class;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getGroupPerPage() {
		return groupPerPage;
	}

	public void setGroupPerPage(Integer groupPerPage) {
		this.groupPerPage = groupPerPage;
	}

	public ResponseFilter getResponseFilter() {
		return responseFilter;
	}

	public void setResponseFilter(ResponseFilter responseFilter) {
		this.responseFilter = responseFilter;
	}
}
