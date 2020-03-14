package com.xnky.taotao.methdFactory;

import com.xnky.taotao.factory.bean.OrderBean;

public class TestFactory {
   public static void main(String[] args) {
	 OrderBean runOrder=new RunOrderFactory().createOrder();
	 runOrder.show();
   OrderBean dataOrder=new DataOrderFactory().createOrder();
    dataOrder.show();
}
}
