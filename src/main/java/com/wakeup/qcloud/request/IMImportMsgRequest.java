package com.wakeup.qcloud.request;

import static com.google.common.collect.Maps.newHashMap;

import java.util.List;
import java.util.Map;

import com.wakeup.qcloud.domain.IMMsgContentDO;
import com.wakeup.qcloud.response.QCloudIMResponse;
import com.wakeup.qcloud.utils.RandomUtil;

/**
 * 导入单聊消息
 * @since 2017年3月4日
 * @author kalman03
 */
public class IMImportMsgRequest<A extends IMMsgContentDO> extends AbstractQCloudIMRequest<QCloudIMResponse> {

	private static final long serialVersionUID = -7973614575899011644L;

	/**
	 * 必填	1，实时消息导入，消息加入未读计数；2，历史消息导入，消息不计入未读。
	 */
	private int syncFromOldSystem;
	/**
	 * 必填	消息发送方账号。（用于指定发送消息方）
	 */
	private String fromAccount;
	/**
	 * 必填	消息接收方账号。
	 */
	private String toAccount;
	/**
	 * 必填     消息内容，具体格式请参考消息格式描述。（注意，一条消息可包括多种消息元素，MsgBody为Array类型）
	 */
	private List<A> msgBody;
	
	
	@Override
	public String getApiName() {
		return "openim/importmsg";
	}

	@Override
	public Map<String, Object> getTextParams() {
		Map<String, Object> map = newHashMap();
		map.put("SyncFromOldSystem", syncFromOldSystem);
		map.put("From_Account", fromAccount);
		map.put("To_Account", toAccount);
		map.put("MsgRandom", RandomUtil.getRandomNumber(7));
		map.put("MsgTimeStamp",  System.nanoTime());
		map.put("MsgBody", msgBody);
		return map;
	}

	@Override
	public Class<QCloudIMResponse> getResponseClass() {
		return QCloudIMResponse.class;
	}

	public int getSyncFromOldSystem() {
		return syncFromOldSystem;
	}

	public void setSyncFromOldSystem(int syncFromOldSystem) {
		this.syncFromOldSystem = syncFromOldSystem;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public List<A> getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(List<A> msgBody) {
		this.msgBody = msgBody;
	}
}
