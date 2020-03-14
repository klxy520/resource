package com.xnky.taotao.decorator;

public class Coffee extends Drink{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public  double cost() {
		
		return super.getPrice();
	}

}
