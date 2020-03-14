package com.xnky.taotao.factory;

import com.xnky.taotao.factory.bean.OrderBean;

/**
 * 测试简单工厂
 * @author 孙雪锋
 *
 */
public class TestFactory {
	public static void main(String[] args) {
		OrderBean runOrder=OrderFactory.createOrder("run");
		runOrder.setName("申请电子邮件");
		runOrder.show();
		OrderBean dataOrder=OrderFactory.createOrder("data");
		dataOrder.setName("东航数据提取工单");
         dataOrder.show();
	}
}
