package com.xnky.taotao.factory;

import com.xnky.taotao.factory.bean.DataOrder;
import com.xnky.taotao.factory.bean.OrderBean;
import com.xnky.taotao.factory.bean.RunOrder;

/**
 * 生产工单对象的工厂
 * 
 * @author 孙雪锋
 *
 */
public class OrderFactory {
	public static OrderBean createOrder(String type) {
		if ("data".equals(type)) {
			return new DataOrder("data");
		} else if ("run".equals(type)) {
			return new RunOrder("run");
		} else {
			return null;
		}
	}
}
