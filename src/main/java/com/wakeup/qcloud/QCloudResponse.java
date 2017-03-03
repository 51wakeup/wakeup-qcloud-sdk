package com.wakeup.qcloud;

import com.wakeup.qcloud.domain.BaseDO;

/**
 * @since 2017年2月23日
 * @author kalman03
 */
public abstract class QCloudResponse extends BaseDO {

	private static final long serialVersionUID = -1049275604612806239L;

	public abstract boolean isSuccess();
}
