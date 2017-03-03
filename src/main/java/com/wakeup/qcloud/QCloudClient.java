package com.wakeup.qcloud;

import java.util.Map;

import com.wakeup.qcloud.listener.QCloudMsgListener;
import com.wakeup.qcloud.listener.QCloudMsgResponse;


/**
 * @since 2017年2月20日
 * @author kalman03
 */
public interface QCloudClient {
	/**
	 * 执行腾讯云的Rest API接口请求
	 * @param request
	 * @return
	 * @throws QCloudException
	 */
	<T extends QCloudResponse> T execute(QCloudRequest<T> request)throws QCloudException;
	/**
	 * 获取sig
	 * @param identifier
	 * @param expire 3600*24*180表示180天
	 */
	String getUserSig(String identifier, long expire)throws QCloudException;
	/**
	 * 校验sig是否正确
	 */
	boolean verifyUserSig(String identifier,String sig)throws QCloudException;
	/**
	 * 处理腾讯云的回调消息
	 */
	QCloudMsgResponse doMsgProcess(QCloudMsgListener msgListener,String msgBody,Map<String,Object> urlParams)throws QCloudException ;
}
