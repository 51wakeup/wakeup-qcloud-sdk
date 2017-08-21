package com.wakeup.qcloud;

import com.wakeup.qcloud.constant.ApplyJoinOption;
import com.wakeup.qcloud.constant.GroupType;
import com.wakeup.qcloud.domain.IMConfigDO;
import com.wakeup.qcloud.request.CreateGroupRequest;
import com.wakeup.qcloud.response.CreateGroupResponse;

/**
 * @since 2017年8月17日
 * @author kalman03
 */
public class Demo {
	
	private final static String identifier = "";
	private final static String privateKey = "";
	private final static String publicKey = "";
	private final static String sdkAppId = "";
	
	private static QCloudClient qcloudClient = initQCloudClient();

	private static QCloudClient initQCloudClient(){
		IMConfigDO imConfig = new IMConfigDO();
		imConfig.setIdentifier(identifier);
		imConfig.setPrivateKey(privateKey);
		imConfig.setPublicKey(publicKey);
		imConfig.setSdkAppId(sdkAppId);
		return new DefaultQCloudClient(imConfig);
	}
	
	private static void createGroup() throws QCloudException{
		CreateGroupRequest request = new CreateGroupRequest();
		request.setGroupId("1000000");
		request.setName("这是一个公开群组");
		request.setType(GroupType.PUBLIC);
		request.setApplyJoinOption(ApplyJoinOption.FreeAccess);
		CreateGroupResponse response = qcloudClient.execute(request);
		
		System.out.println(response);
		
		if(response.isSuccess()){
			//do success logic
		}else{
			//do error logic
		}
	}
	
	public static void main(String[] args) {
		try {
			createGroup();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
