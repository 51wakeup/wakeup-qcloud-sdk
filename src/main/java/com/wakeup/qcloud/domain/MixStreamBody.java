package com.wakeup.qcloud.domain;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @since 2017年8月2日
 * @author kalman03
 */
public class MixStreamBody extends BaseDO{

	private static final long serialVersionUID = -6073332110774363180L;
	private long timestamp;
	private long eventId;
	@JSONField(name="interface")
	private Interface _interface;
	
	public class Interface extends BaseDO{
	
		private static final long serialVersionUID = -1748366686696869844L;
		private final String interfaceName = "Mix_StreamV2";
		private MixStreamDO para;
		public MixStreamDO getPara() {
			return para;
		}
		public void setPara(MixStreamDO para) {
			this.para = para;
		}
		public String getInterfaceName() {
			return interfaceName;
		}
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public Interface get_interface() {
		return _interface;
	}

	public void set_interface(Interface _interface) {
		this._interface = _interface;
	}
	
}
