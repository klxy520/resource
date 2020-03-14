package com.xnky.taotao.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 
 *通过实行InvocationHandler接口来实现动态jdk代理
 * @author 孙雪锋
 *
 */
public class UserServiceProxy2  implements InvocationHandler {
	private Object object;

	public UserServiceProxy2(Object object) {
		super();
		this.object = object;
	}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			Object invoke = method.invoke(object, args);
			return invoke;
		}
	public Object getProxyObject() {
		return  Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
	}
}
