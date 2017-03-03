package com.wakeup.qcloud.request;
/**
 * @since 2017年2月23日
 * @author kalman03
 */
public class GetLivePlayStatRequest extends GetLiveStatRequest {

	
	private static final long serialVersionUID = 5130191371644701959L;

	@Override
	public String getInterface() {
		return "Get_LivePlayStat";
	}
}
