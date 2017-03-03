package com.wakeup.qcloud.domain;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class OptPlatform {
	/**
	 * RESTAPI（使用REST API发送请求）
	 */
	public final static String RESTAPI = "RESTAPI";
	/**
	 * Web（使用Web SDK发送请求）
	 */
	public final static String Web = "Web";
	public final static String Android = "Android";
	public final static String iOS = "iOS";
	public final static String Windows = "Windows";
	public final static String Mac = "Mac";
	/**
	 * （使用未知类型的设备发送请求）
	 */
	public final static String Unkown = "Unkown";
}
