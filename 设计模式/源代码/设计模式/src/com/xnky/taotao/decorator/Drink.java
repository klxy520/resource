package com.xnky.taotao.decorator;

import java.io.Serializable;

public abstract class Drink implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String  dec;
	private double  price=0.0;
	
	public String getDec() {
		return dec;
	}

	public void setDec(String dec) {
		this.dec = dec;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	abstract  double cost();
}
