package com.xnky.taotao.observer.test1;

import java.util.Observable;

public class Teacher extends Observable{
	private String number;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
		setChanged();
		notifyObservers();
	}
}
