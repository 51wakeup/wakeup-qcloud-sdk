package com.wakeup.qcloud.listener;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.wakeup.qcloud.constant.CallbackCommand;
import com.wakeup.qcloud.constant.IMMsgType;
import com.wakeup.qcloud.domain.CustomMsgContentDO;
import com.wakeup.qcloud.domain.FaceMsgContentDO;
import com.wakeup.qcloud.domain.FileMsgContentDO;
import com.wakeup.qcloud.domain.IMMsgBody;
import com.wakeup.qcloud.domain.IMMsgContentDO;
import com.wakeup.qcloud.domain.ImageMsgContentDO;
import com.wakeup.qcloud.domain.LocationMsgContentDO;
import com.wakeup.qcloud.domain.SoundMsgContentDO;
import com.wakeup.qcloud.domain.TextMsgContentDO;
import com.wakeup.qcloud.listener.request.GroupCallbackSendMsgReq;
import com.wakeup.qcloud.listener.response.GroupCallbackBeforeSendMsgResp;

/**
 * @since 2017年2月24日
 * @author kalman03
 */
public abstract class AbstractIMMsgListener implements QCloudMsgListener {

	public abstract QCloudMsgResponse onInvalidRequest(String body,Map<String, Object> urlParams);
	/**
	 * <h1>群内发言之前回调，云通信后台收到用户发送的群发消息之后、将该消息下发给群成员之前。</h1>
	 * https://www.qcloud.com/document/product/269/1619<br>
	 * 
	 * 可能触发该回调的场景：APP用户通过客户端发送群消息； APP管理员通过REST API发送群组消息。
	 */
	public GroupCallbackBeforeSendMsgResp onGroupBeforeSendMsg(GroupCallbackSendMsgReq msgReq,UrlParamDO urlParams) {
		return new GroupCallbackBeforeSendMsgResp();
	}
	/**
	 * <h1>群内发言之后回调,群组消息发送成功之后</h1>
	 * https://www.qcloud.com/document/product/269/2661<br>
	 * 可能触发该回调的场景：APP用户通过客户端发送群消息； APP管理员通过REST API发送群组消息。
	 */
	public IMMsgResponse onGroupAfterSendMsg(GroupCallbackSendMsgReq msgReq,UrlParamDO urlParams){
		return new IMMsgResponse();
	}

	@Override
	public final QCloudMsgResponse doProcess(String body,Map<String, Object> urlParams, String key) {
		Object sdkAppid = urlParams.get("SdkAppid");
		if(sdkAppid ==null || !sdkAppid.toString().equals(key)){
			return onInvalidRequest(body, urlParams);
		}
		
		UrlParamDO paramDO = JSON.parseObject(JSON.toJSONString(urlParams), UrlParamDO.class);
		switch (paramDO.getCallbackCommond()) {
		case CallbackCommand.GroupCallbackBeforeSendMsg:
			GroupCallbackSendMsgReq msgReq = toGroupCallbackSendMsgReq(body);
			return onGroupBeforeSendMsg(msgReq, paramDO);
		case CallbackCommand.GroupCallbackAfterSendMsg:
			GroupCallbackSendMsgReq msgReq2 = toGroupCallbackSendMsgReq(body);
			return onGroupAfterSendMsg(msgReq2, paramDO);
		default:
			break;
		}
		return null;
	}

	
	private GroupCallbackSendMsgReq toGroupCallbackSendMsgReq(String body){
		JSONObject jsonObject = JSON.parseObject(body);
		GroupCallbackSendMsgReq msgReq = new GroupCallbackSendMsgReq();
		msgReq.setCallbackCommand(jsonObject.getString("CallbackCommand"));
		msgReq.setFromAccount(jsonObject.getString("From_Account"));
		msgReq.setGroupId(jsonObject.getString("GroupId"));
		msgReq.setOperatorAccount(jsonObject.getString("Operator_Account"));
		msgReq.setRandom(jsonObject.getLongValue("Random"));
		msgReq.setType(jsonObject.getString("Type"));
		
		JSONArray msgBodyArray= JSON.parseArray(jsonObject.getString("MsgBody"));
		List<IMMsgBody<? extends IMMsgContentDO>> msgBody = newArrayList();
		for(Object object : msgBodyArray){
			JSONObject _body = JSON.parseObject(object.toString());
			String msgType = _body.getString("MsgType");
			switch (msgType) {
			case IMMsgType.TIMTextElem:
				IMMsgBody<TextMsgContentDO> imMsgBody = JSON.parseObject(
						object.toString(),
						new TypeReference<IMMsgBody<TextMsgContentDO>>() {
						});
				msgBody.add(imMsgBody);
				break;
			case IMMsgType.TIMFaceElem:
				IMMsgBody<FaceMsgContentDO> imMsgBody2 = JSON.parseObject(
						object.toString(),
						new TypeReference<IMMsgBody<FaceMsgContentDO>>() {
						});
				msgBody.add(imMsgBody2);
				break;
			case IMMsgType.TIMCustomElem:
				IMMsgBody<CustomMsgContentDO> imMsgBody3 = JSON.parseObject(
						object.toString(),
						new TypeReference<IMMsgBody<CustomMsgContentDO>>() {
						});
				msgBody.add(imMsgBody3);
				break;
			case IMMsgType.TIMLocationElem:
				IMMsgBody<LocationMsgContentDO> imMsgBody4 = JSON.parseObject(
						object.toString(),
						new TypeReference<IMMsgBody<LocationMsgContentDO>>() {
						});
				msgBody.add(imMsgBody4);
				break;
			case IMMsgType.TIMFileElem:
				IMMsgBody<FileMsgContentDO> imMsgBody5 = JSON.parseObject(
						object.toString(),
						new TypeReference<IMMsgBody<FileMsgContentDO>>() {
						});
				msgBody.add(imMsgBody5);
				break;
			case IMMsgType.TIMImageElem:
				IMMsgBody<ImageMsgContentDO> imMsgBody6 = JSON.parseObject(
						object.toString(),
						new TypeReference<IMMsgBody<ImageMsgContentDO>>() {
						});
				msgBody.add(imMsgBody6);
				break;
			case IMMsgType.TIMSoundElem:
				IMMsgBody<SoundMsgContentDO> imMsgBody7 = JSON.parseObject(
						object.toString(),
						new TypeReference<IMMsgBody<SoundMsgContentDO>>() {
						});
				msgBody.add(imMsgBody7);
				break;
			default:
				break;
			}
		}
		msgReq.setMsgBody(msgBody);
		return msgReq;
	}
}
