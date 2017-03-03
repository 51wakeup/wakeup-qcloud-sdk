package com.wakeup.qcloud.request;


/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class GetLivePushStatRequest extends GetLiveStatRequest {

	private static final long serialVersionUID = -3378381606070172847L;

	@Override
	public String getInterface() {
		return "Get_LivePushStat";
	}

}
