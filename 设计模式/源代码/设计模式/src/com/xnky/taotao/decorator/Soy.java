package com.xnky.taotao.decorator;

public class Soy extends Dcorator {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Soy(Drink drink) {
		super(drink);
		setDec("豆浆");
		setPrice(5.4);
	}

}
