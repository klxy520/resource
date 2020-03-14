package com.xnky.taotao.decorator.test.zoo;

public class LandAnimal extends Specialfunctions{

	public LandAnimal(Zoo zoo) {
		super(zoo);
	}
	private String eat() {
		return"吃肉";
	}

	private String bellow() {
		return"吼叫";
	}
	@Override
	public void show() {
		super.show();
		System.out.println("======特殊功能========");
		System.out.println(eat()+","+bellow());
	}
}
