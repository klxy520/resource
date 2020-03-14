package com.xnky.taotao.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 通过非接口来实现动态jdk代理
 * @author 孙雪锋
 *
 */
public class UserServiceProxy  {
	private Object object;

	public UserServiceProxy(Object object) {
		super();
		this.object = object;
	}
	public Object getProxyObject() {
		return  Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				Object invoke = method.invoke(object, args);
				return invoke;
			}
		});
	}
}
