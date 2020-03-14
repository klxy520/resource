package com.xnky.taotao.decorator;

public class Chocolate extends Dcorator{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Chocolate(Drink drink) {
		super(drink);
		setDec("巧克力");
		setPrice(5.7);
	}


}
