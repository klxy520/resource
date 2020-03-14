package com.xnky.taotao.decorator.test.zoo;

public class FlyAinmal extends Specialfunctions{

	public FlyAinmal(Zoo zoo) {
		super(zoo);
	}

	@Override
	public void show() {
		super.show();
		System.out.println("======特殊功能========");
		System.out.println("会飞,有翅膀");
	}
}
