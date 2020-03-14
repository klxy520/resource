package com.xnky.taotao.singleton;

/**
 * 内部类实现单例模式 优点：线程安全，效率高, 实现懒加载
 * 
 * @author 孙雪锋
 *
 */

public class SingLeTonDom3 {
	private SingLeTonDom3() {
	}

	private static class getSingLeTonInstance {
		private static SingLeTonDom3 singLeTonInstance = new SingLeTonDom3();
	}

	public static SingLeTonDom3 getSingLeTonDom() {
		return getSingLeTonInstance.singLeTonInstance;
	}
}