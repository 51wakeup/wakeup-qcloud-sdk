package com.wakeup.qcloud.domain;

import com.wakeup.qcloud.constant.IMMsgType;


/**
 * @since 2017年2月20日
 * @author kalman03
 */
public abstract class IMMsgContentDO extends BaseDO{

	private static final long serialVersionUID = 7518157708759867618L;
	/**
	 * {@link IMMsgType}
	 */
	public abstract String getMsgType();
}
