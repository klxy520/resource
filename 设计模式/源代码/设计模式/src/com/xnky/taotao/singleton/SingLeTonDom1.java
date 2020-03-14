package com.xnky.taotao.singleton;

import java.util.function.Consumer;

/**
 * 设计模式 单例模式 饿汉式  不能实现懒加载， 线程安全， 效率高
 * 
 * @author 孙雪锋
 *
 */
public class SingLeTonDom1 {
	private static SingLeTonDom1 singLeTonDom = new SingLeTonDom1();

	private SingLeTonDom1() {

	}

	public static SingLeTonDom1 getSingLeTonDom() {
		return singLeTonDom;
	}
	
	public static void main(String[] args) {

		Consumer<String> consumer=x ->System.out.println(x);
		consumer.accept("1111111111111111");
	}
}
