package com.wakeup.qcloud.domain;
/**
 * 目前腾讯云支持三种消息类型的通知：0 — 断流； 1 — 推流；100 — 新的录制文件已生成；200 — 新的截图文件已生成。
 * @since 2017年2月24日
 * @author kalman03
 */
public class LiveMsgEventType {

	/**
	 * 断流
	 */
	public final static int  CUT_STREAM = 0;
	/**
	 * 推流
	 */
	public final static int PUSH_STREAM = 1;
	/**
	 * 新的录制文件已生成
	 */
	public final static int RECORD_AV_CREATED = 100;
	/**
	 *  新的截图文件已生成
	 */
	public final static int SCREENSHOT_CREATED = 200;
}
