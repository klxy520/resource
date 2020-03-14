package com.xnky.taotao.methdFactory;

import com.xnky.taotao.factory.bean.OrderBean;
import com.xnky.taotao.factory.bean.RunOrder;

public class RunOrderFactory implements OrderFactory{

	@Override
	public OrderBean createOrder() {
		return new RunOrder("run");
	}

}
