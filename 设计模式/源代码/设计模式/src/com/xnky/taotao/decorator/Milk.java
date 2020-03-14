package com.xnky.taotao.decorator;


public class Milk extends Dcorator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Milk(Drink drink) {
		super(drink);
		setDec("牛奶");
		setPrice(6.88);
	}

}
