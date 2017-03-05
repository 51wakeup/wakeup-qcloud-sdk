package com.wakeup.qcloud.constant;
/**
 * @since 2017年2月20日
 * @author kalman03
 */
public class IMMsgType {
	/**
	 * 文本消息
	 */
	public final static String TIMTextElem = "TIMTextElem";
	/**
	 * 地理位置消息
	 */
	public final static String TIMLocationElem = "TIMLocationElem";
	/**
	 * 表情消息
	 */
	public final static String TIMFaceElem = "TIMFaceElem";
	/**
	 * 自定义消息，当接收方为IOS系统且应用处在后台时，此消息类型可携带除文本以外的字段到APNS。注意，一条组合消息中只能包含一个TIMCustomElem自定义消息元素
	 */
	public final static String TIMCustomElem = "TIMCustomElem";
	/**
	 * 语音消息
	 */
	public final static String TIMSoundElem = "TIMSoundElem";
	/**
	 * 图像消息
	 */
	public final static String TIMImageElem = "TIMImageElem";
	/**
	 * 文件消息
	 */
	public final static String TIMFileElem = "TIMFileElem";
}
