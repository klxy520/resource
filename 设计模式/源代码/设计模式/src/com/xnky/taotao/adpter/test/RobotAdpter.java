package com.xnky.taotao.adpter.test;

public class RobotAdpter implements RobotImitate{
	
	
	private Dog dog;
	private Persion persion;

	@Override
	public void run() {
		persion.run();
		
	}

	@Override
	public void cry() {
	dog.cry();	// TODO Auto-generated method stub
		
	}

	public RobotAdpter(Dog dog, Persion persion) {
		super();
		this.dog = dog;
		this.persion = persion;
	}
}
