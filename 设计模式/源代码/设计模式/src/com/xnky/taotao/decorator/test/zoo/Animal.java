package com.xnky.taotao.decorator.test.zoo;

public class Animal implements Zoo{
    private String name;
	@Override
	public void show() {
	System.out.println("这是一只:"+getName());
	 System.out.println("基本功能:"+sleep()+","+breathing()+","+foraging());
	}
   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String sleep() {
		return "睡觉";
	}
	protected String breathing() {
		return "呼吸";
	}
	protected String foraging() {
		return "觅食";
	}
}
