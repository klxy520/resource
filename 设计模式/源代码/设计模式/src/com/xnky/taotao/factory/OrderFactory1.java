package com.xnky.taotao.factory;

import com.xnky.taotao.factory.bean.DataOrder;
import com.xnky.taotao.factory.bean.OrderBean;
import com.xnky.taotao.factory.bean.RunOrder;

/**
 *简单工厂第二种
 * @author 孙雪锋
 *
 */
public class OrderFactory1 {
	public static OrderBean createRunOrder() {
		return new RunOrder("run");
	}
	public static OrderBean createDataOrder() {
		return new DataOrder("data");
	}
}
