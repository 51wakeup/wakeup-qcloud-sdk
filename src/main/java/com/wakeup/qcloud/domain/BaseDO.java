package com.wakeup.qcloud.domain;

import java.io.Serializable;

import com.alibaba.fastjson.JSON;

/**
 * @since 2017年2月26日
 * @author kalman03
 */
public class BaseDO implements Serializable{

	private static final long serialVersionUID = 7390746019777949760L;

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

	
}
