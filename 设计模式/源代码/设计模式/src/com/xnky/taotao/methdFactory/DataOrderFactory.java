package com.xnky.taotao.methdFactory;

import com.xnky.taotao.factory.bean.DataOrder;
import com.xnky.taotao.factory.bean.OrderBean;

public class DataOrderFactory implements OrderFactory{

	@Override
	public OrderBean createOrder() {
		return new DataOrder("data");
	}

}
