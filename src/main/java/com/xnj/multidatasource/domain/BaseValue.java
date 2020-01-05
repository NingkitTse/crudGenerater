package com.xnj.multidatasource.domain;

import com.alibaba.fastjson.JSON;

public class BaseValue {
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
