package com.xnky.taotao.proxy.staticp;

public class UserContrller {
      public static void main(String[] args) {
		 UserService userServiceProxy= ProxyFactory.getUserServiceProxy();
		 userServiceProxy.add(new Object());
		 userServiceProxy.delete("111");
		 userServiceProxy.select("1223");
		 userServiceProxy.update(new Object());
	}
}
