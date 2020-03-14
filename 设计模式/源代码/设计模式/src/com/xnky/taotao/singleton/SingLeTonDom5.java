package com.xnky.taotao.singleton;

import java.io.ObjectStreamException;
import java.util.function.Consumer;

/**
 * 懒汉式 单例模式 实现懒加载 线程安全，效率低(防反射和防反序列化漏洞)
 * 
 * @author 孙雪锋
 *
 */
public class SingLeTonDom5 {
	private static SingLeTonDom5 singLeTonDom;

	private SingLeTonDom5() throws Exception {
		if (singLeTonDom != null) { // 防反射 
			throw new Exception();
		}
	}

	public static synchronized SingLeTonDom5 getsLeTonDom() throws Exception {
		if (singLeTonDom == null) {
			singLeTonDom = new SingLeTonDom5();
		}
		return singLeTonDom;
	}
	//防反序列化
	private Object readResolve() throws ObjectStreamException{
		return singLeTonDom;
	}
}
