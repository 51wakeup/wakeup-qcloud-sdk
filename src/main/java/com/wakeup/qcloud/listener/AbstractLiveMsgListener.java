package com.wakeup.qcloud.listener;

import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wakeup.qcloud.domain.LiveMsgAvRecordCreatedDO;
import com.wakeup.qcloud.domain.LiveMsgEventType;
import com.wakeup.qcloud.domain.LiveMsgScreenshotCreatedDO;
import com.wakeup.qcloud.domain.LiveMsgStreamEventDO;

/**
 * 腾讯云直播消息处理
 * 
 * @since 2017年2月24日
 * @author kalman03
 */
public abstract class AbstractLiveMsgListener implements QCloudMsgListener {

	/**
	 * 非法的请求处理，可重载
	 */
	public LiveMsgResponse onInvalidMsg(String json) {
		return LiveMsgResponse.FAILED;
	}
	/**
	 * 腾讯云通知直播流发生断流（event_type=0）事件。
	 */
	public abstract LiveMsgResponse onCutStream(LiveMsgStreamEventDO msgEventDO);
	/**
	 * 腾讯云通知直播流发生推流（event_type=0）事件。
	 */
	public abstract LiveMsgResponse onPushStream(LiveMsgStreamEventDO msgEventDO);
	/**
	 * 有新的录制文件生成
	 */
	public abstract LiveMsgResponse onAvRecordCreated(LiveMsgAvRecordCreatedDO msgEventDO);
	/**
	 * 有新的截图图片生成
	 */
	public abstract LiveMsgResponse onScreenshotCreated(LiveMsgScreenshotCreatedDO msgEventDO);

	@Override
	public final QCloudMsgResponse doProcess(String jsonBody,Map<String,Object> urlParams,String key) {
		JSONObject jsonObject = JSON.parseObject(jsonBody);
		String sign = jsonObject.getString("sign");
		long t = jsonObject.getLongValue("t");
		if (!isValid(t, key, sign)) {
			return onInvalidMsg(jsonBody);
		}
		int eventType = jsonObject.getIntValue("event_type");
		switch (eventType) {
		case LiveMsgEventType.CUT_STREAM:
			return onCutStream(JSON.parseObject(jsonBody, LiveMsgStreamEventDO.class));
		case LiveMsgEventType.PUSH_STREAM:
			return onPushStream(JSON.parseObject(jsonBody, LiveMsgStreamEventDO.class));
		case LiveMsgEventType.RECORD_AV_CREATED:
			return onAvRecordCreated(JSON.parseObject(jsonBody, LiveMsgAvRecordCreatedDO.class));
		case LiveMsgEventType.SCREENSHOT_CREATED:
			return onScreenshotCreated(JSON.parseObject(jsonBody, LiveMsgScreenshotCreatedDO.class));
		default:
			break;
		}
		return LiveMsgResponse.FAILED;
	}

	private boolean isValid(long t, String key, String t_sign) {
		String in_sign = DigestUtils.md5Hex(key + t);
		return in_sign.equals(t_sign);
	}
}
