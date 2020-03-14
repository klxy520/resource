package com.xnky.taotao.decorator;

public class Dcorator extends Drink {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Drink drink;

	public Dcorator(Drink drink) {
		this.drink = drink;
	}

	@Override
	double cost() {
	double d=super.getPrice() + drink.getPrice();
		return d;
	}

	public String getDsc() {
		return getDec() + "的" + drink.getDec();
	}
}
