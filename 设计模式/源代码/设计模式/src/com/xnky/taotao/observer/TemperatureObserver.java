package com.xnky.taotao.observer;

import java.util.Observable;
import java.util.Observer;

public class TemperatureObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg);
	}


}
