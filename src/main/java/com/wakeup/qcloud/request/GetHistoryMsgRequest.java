package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import com.wakeup.qcloud.response.GetHistoryMsgResponse;

/**
 * 消息记录下载 https://www.qcloud.com/document/product/269/1650
 * 
 * @since 2017年3月5日
 * @author kalman03
 */
public class GetHistoryMsgRequest extends
		AbstractQCloudIMRequest<GetHistoryMsgResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 必填 消息类型，C2C:单发消息 Group:群组消息。
	 */
	private String chatType;
	/**
	 * 必填 需要下载的时间段，2015120121表示获取2015年12月1日21:00~21:59的消息的下载地址。
	 */
	private String msgTime;

	@Override
	public String getApiName() {
		return "open_msg_svc/get_history";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("ChatType", chatType);
		map.put("MsgTime", msgTime);
		return map;
	}

	@Override
	public Class<GetHistoryMsgResponse> getResponseClass() {
		return GetHistoryMsgResponse.class;
	}

	public String getChatType() {
		return chatType;
	}

	public void setChatType(String chatType) {
		this.chatType = chatType;
	}

	public String getMsgTime() {
		return msgTime;
	}

	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}
}
