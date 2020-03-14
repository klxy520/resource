package com.xnky.taotao.enjoying;

public class StirngConstant extends constant{

	public StirngConstant(String constantName) {
		super(constantName);
	}

	@Override
	void show() {
		System.out.println(getName()+"使用了常量"+getConstantName());
	}
     
}
