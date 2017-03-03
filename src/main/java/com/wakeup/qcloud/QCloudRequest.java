package com.wakeup.qcloud;

import java.util.Map;

/**
 * @since 2017年2月20日
 * @author kalman03
 */
public interface QCloudRequest<T extends QCloudResponse> {
	/**
	 * 获取请求地址
	 */
	String getRequestUrl();
	/**
	 * 获取所有的Key-Value形式的文本请求参数集合。其中：
	 * <ul>
	 * <li>Key: 请求参数名</li>
	 * <li>Value: 请求参数值</li>
	 * </ul>
	 * @return 文本请求参数集合
	 */
	Map<String, Object> getTextParams();
	/**
	 * 获取请求的腾讯云业务
	 */
	QCloudBiz getService();
	/**
	 * 获取具体响应实现类的定义。
	 */
	Class<T> getResponseClass();
	/**
	 * 请求方法
	 */
	RequestMethod getRequestMethod();
	
	
}