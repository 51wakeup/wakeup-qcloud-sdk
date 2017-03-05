package com.wakeup.qcloud.response;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.wakeup.qcloud.domain.BaseDO;

/**
 * @since 2017年3月5日
 * @author kalman03
 */
public class GetAppInfoResponse extends QCloudIMResponse {

	private static final long serialVersionUID = 1095980905089249771L;
	@JSONField(name = "Result")
	private List<Result> results;

	public static class Result extends BaseDO {

		private static final long serialVersionUID = -7996726586843528534L;
		private String APNSMsgNum;
		private String ActiveUserNum;
		private String AppId;
		private String AppName;
		private String C2CAPNSMsgNum;
		private String C2CDownMsgNum;
		private String C2CSendMsgUserNum;
		private String C2CUpMsgNum;
		private String CallBackReq;
		private String CallBackRsp;
		private String ChainDecrease;
		private String ChainIncrease;
		private String Company;
		private String Date;
		private String DownMsgNum;
		private String GroupAPNSMsgNum;
		private String GroupAllGroupNum;
		private String GroupDestroyGroupNum;
		private String GroupDownMsgNum;
		private String GroupJoinGroupTimes;
		private String GroupNewGroupNum;
		private String GroupQuitGroupTimes;
		private String GroupSendMsgGroupNum;
		private String GroupSendMsgUserNum;
		private String GroupUpMsgNum;
		private String LoginTimes;
		private String LoginUserNum;
		private String MaxOnlineNum;
		private String QQ;
		private String RegistUserNumOneDay;
		private String SendMsgUserNum;
		private String RegistUserNumTotal;
		private String TextMsgInNum;
		private String TextMsgOutNum;
		private String UpMsgNum;
		private String VoiceMsgInNum;
		private String VoiceMsgOutNum;

		public String getAPNSMsgNum() {
			return APNSMsgNum;
		}

		public void setAPNSMsgNum(String aPNSMsgNum) {
			APNSMsgNum = aPNSMsgNum;
		}

		public String getActiveUserNum() {
			return ActiveUserNum;
		}

		public void setActiveUserNum(String activeUserNum) {
			ActiveUserNum = activeUserNum;
		}

		public String getAppId() {
			return AppId;
		}

		public void setAppId(String appId) {
			AppId = appId;
		}

		public String getAppName() {
			return AppName;
		}

		public void setAppName(String appName) {
			AppName = appName;
		}

		public String getC2CAPNSMsgNum() {
			return C2CAPNSMsgNum;
		}

		public void setC2CAPNSMsgNum(String c2capnsMsgNum) {
			C2CAPNSMsgNum = c2capnsMsgNum;
		}

		public String getC2CDownMsgNum() {
			return C2CDownMsgNum;
		}

		public void setC2CDownMsgNum(String c2cDownMsgNum) {
			C2CDownMsgNum = c2cDownMsgNum;
		}

		public String getC2CSendMsgUserNum() {
			return C2CSendMsgUserNum;
		}

		public void setC2CSendMsgUserNum(String c2cSendMsgUserNum) {
			C2CSendMsgUserNum = c2cSendMsgUserNum;
		}

		public String getC2CUpMsgNum() {
			return C2CUpMsgNum;
		}

		public void setC2CUpMsgNum(String c2cUpMsgNum) {
			C2CUpMsgNum = c2cUpMsgNum;
		}

		public String getCallBackReq() {
			return CallBackReq;
		}

		public void setCallBackReq(String callBackReq) {
			CallBackReq = callBackReq;
		}

		public String getCallBackRsp() {
			return CallBackRsp;
		}

		public void setCallBackRsp(String callBackRsp) {
			CallBackRsp = callBackRsp;
		}

		public String getChainDecrease() {
			return ChainDecrease;
		}

		public void setChainDecrease(String chainDecrease) {
			ChainDecrease = chainDecrease;
		}

		public String getChainIncrease() {
			return ChainIncrease;
		}

		public void setChainIncrease(String chainIncrease) {
			ChainIncrease = chainIncrease;
		}

		public String getCompany() {
			return Company;
		}

		public void setCompany(String company) {
			Company = company;
		}

		public String getDate() {
			return Date;
		}

		public void setDate(String date) {
			Date = date;
		}

		public String getDownMsgNum() {
			return DownMsgNum;
		}

		public void setDownMsgNum(String downMsgNum) {
			DownMsgNum = downMsgNum;
		}

		public String getGroupAPNSMsgNum() {
			return GroupAPNSMsgNum;
		}

		public void setGroupAPNSMsgNum(String groupAPNSMsgNum) {
			GroupAPNSMsgNum = groupAPNSMsgNum;
		}

		public String getGroupAllGroupNum() {
			return GroupAllGroupNum;
		}

		public void setGroupAllGroupNum(String groupAllGroupNum) {
			GroupAllGroupNum = groupAllGroupNum;
		}

		public String getGroupDestroyGroupNum() {
			return GroupDestroyGroupNum;
		}

		public void setGroupDestroyGroupNum(String groupDestroyGroupNum) {
			GroupDestroyGroupNum = groupDestroyGroupNum;
		}

		public String getGroupDownMsgNum() {
			return GroupDownMsgNum;
		}

		public void setGroupDownMsgNum(String groupDownMsgNum) {
			GroupDownMsgNum = groupDownMsgNum;
		}

		public String getGroupJoinGroupTimes() {
			return GroupJoinGroupTimes;
		}

		public void setGroupJoinGroupTimes(String groupJoinGroupTimes) {
			GroupJoinGroupTimes = groupJoinGroupTimes;
		}

		public String getGroupNewGroupNum() {
			return GroupNewGroupNum;
		}

		public void setGroupNewGroupNum(String groupNewGroupNum) {
			GroupNewGroupNum = groupNewGroupNum;
		}

		public String getGroupQuitGroupTimes() {
			return GroupQuitGroupTimes;
		}

		public void setGroupQuitGroupTimes(String groupQuitGroupTimes) {
			GroupQuitGroupTimes = groupQuitGroupTimes;
		}

		public String getGroupSendMsgGroupNum() {
			return GroupSendMsgGroupNum;
		}

		public void setGroupSendMsgGroupNum(String groupSendMsgGroupNum) {
			GroupSendMsgGroupNum = groupSendMsgGroupNum;
		}

		public String getGroupSendMsgUserNum() {
			return GroupSendMsgUserNum;
		}

		public void setGroupSendMsgUserNum(String groupSendMsgUserNum) {
			GroupSendMsgUserNum = groupSendMsgUserNum;
		}

		public String getGroupUpMsgNum() {
			return GroupUpMsgNum;
		}

		public void setGroupUpMsgNum(String groupUpMsgNum) {
			GroupUpMsgNum = groupUpMsgNum;
		}

		public String getLoginTimes() {
			return LoginTimes;
		}

		public void setLoginTimes(String loginTimes) {
			LoginTimes = loginTimes;
		}

		public String getLoginUserNum() {
			return LoginUserNum;
		}

		public void setLoginUserNum(String loginUserNum) {
			LoginUserNum = loginUserNum;
		}

		public String getMaxOnlineNum() {
			return MaxOnlineNum;
		}

		public void setMaxOnlineNum(String maxOnlineNum) {
			MaxOnlineNum = maxOnlineNum;
		}

		public String getQQ() {
			return QQ;
		}

		public void setQQ(String qQ) {
			QQ = qQ;
		}

		public String getRegistUserNumOneDay() {
			return RegistUserNumOneDay;
		}

		public void setRegistUserNumOneDay(String registUserNumOneDay) {
			RegistUserNumOneDay = registUserNumOneDay;
		}

		public String getSendMsgUserNum() {
			return SendMsgUserNum;
		}

		public void setSendMsgUserNum(String sendMsgUserNum) {
			SendMsgUserNum = sendMsgUserNum;
		}

		public String getRegistUserNumTotal() {
			return RegistUserNumTotal;
		}

		public void setRegistUserNumTotal(String registUserNumTotal) {
			RegistUserNumTotal = registUserNumTotal;
		}

		public String getTextMsgInNum() {
			return TextMsgInNum;
		}

		public void setTextMsgInNum(String textMsgInNum) {
			TextMsgInNum = textMsgInNum;
		}

		public String getTextMsgOutNum() {
			return TextMsgOutNum;
		}

		public void setTextMsgOutNum(String textMsgOutNum) {
			TextMsgOutNum = textMsgOutNum;
		}

		public String getUpMsgNum() {
			return UpMsgNum;
		}

		public void setUpMsgNum(String upMsgNum) {
			UpMsgNum = upMsgNum;
		}

		public String getVoiceMsgInNum() {
			return VoiceMsgInNum;
		}

		public void setVoiceMsgInNum(String voiceMsgInNum) {
			VoiceMsgInNum = voiceMsgInNum;
		}

		public String getVoiceMsgOutNum() {
			return VoiceMsgOutNum;
		}

		public void setVoiceMsgOutNum(String voiceMsgOutNum) {
			VoiceMsgOutNum = voiceMsgOutNum;
		}
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}
}
