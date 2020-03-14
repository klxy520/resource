package com.xnky.taotao.singleton;
/**
 *  懒汉式 单例模式 实现懒加载 线程安全，效率低
 * @author 孙雪锋
 *
 */
public class SingLeTonDom2 {
	private static SingLeTonDom2 singLeTonDom;
	private SingLeTonDom2() {
		
	}
	public static synchronized SingLeTonDom2 getsLeTonDom() {
		if (singLeTonDom==null) {
			singLeTonDom=new SingLeTonDom2();
		}
		return singLeTonDom;
	}
}
