package com.wakeup.qcloud.listener;

import java.util.Map;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public interface QCloudMsgListener {

	QCloudMsgResponse doProcess(String body,Map<String,Object> urlParams,String key);
}
