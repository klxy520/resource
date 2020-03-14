package com.xnky.taotao.proxy.dynamic;

import com.xnky.taotao.proxy.staticp.UserService;
import com.xnky.taotao.proxy.staticp.UserServiceImpl;

public class UserContrller {



	public static void main(String[] args) {

		UserService userService=new  UserServiceImpl();
		UserService proxyObject =(UserService) new UserServiceProxy2(userService).getProxyObject();
		proxyObject.add(new Object());
		proxyObject.delete("111");
		proxyObject.select("1223");
		proxyObject.update(new Object());
	}
}
