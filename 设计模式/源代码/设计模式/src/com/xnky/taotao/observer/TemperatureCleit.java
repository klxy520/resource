package com.xnky.taotao.observer;

import java.util.Observer;
import java.util.function.Supplier;

public class TemperatureCleit {
      public static void main(String[] args) {
		  Supplier<Temperature> supplier=Temperature::new;
		  Temperature subject = supplier.get();
		  Supplier<TemperatureObserver> temperatureObserverSupplier=TemperatureObserver::new;
		  TemperatureObserver obersver = temperatureObserverSupplier.get();
		  subject.addObserver(obersver);
		subject.setData("数据1");
		System.out.println("=====================");
		subject.setData("数据2");
		
	}
}
