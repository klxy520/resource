package com.xnky.taotao.adpter.test;

public class Dog implements Animal{

	@Override
	public void cry() {
		System.out.println("狗嘴巴叫");
	}

	@Override
	public void run() {
		System.out.println("4条跑");
		
	}
    
}
