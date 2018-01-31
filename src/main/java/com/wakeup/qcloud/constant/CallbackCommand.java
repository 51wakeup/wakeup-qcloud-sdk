package com.wakeup.qcloud.constant;
/**
 * @since 2017年2月24日
 * @author kalman03
 */
public class CallbackCommand {

	/**
	 * 群内发言之前回调
	 */
	public final static String GroupCallbackBeforeSendMsg = "Group.CallbackBeforeSendMsg";
	
	/**
	 * 群内发言之后回调
	 */
	public final static String GroupCallbackAfterSendMsg = "Group.CallbackAfterSendMsg";
	/**
	 * 新成员入群之后回调
	 */
	public final static String GroupCallbackAfterNewMemberJoin = "Group.CallbackAfterNewMemberJoin";
	
	/**
	 * 群成员离开之后回调
	 */
	public final static String GroupCallbackAfterMemberExit = "Group.CallbackAfterMemberExit";
}
