package com.xnky.taotao.decorator.test.zoo;

public class Specialfunctions implements Zoo{

	private Zoo zoo;
	public Specialfunctions(Zoo zoo) {
	  this.zoo=zoo;
	}

	@Override
	public void show() {
		zoo.show();
	}
 
}
