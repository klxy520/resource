package com.xnky.taotao.proxy.staticp;

public class ProxyFactory {
    
	public static UserService getUserServiceProxy() {
		 UserService userService=new UserServiceImpl();
		 UserService userServiceProxy=new UserServiceProxy(userService);
		 return userServiceProxy;
	}
}
