package com.xnky.taotao.observer.test1;

import java.util.Observable;
import java.util.Observer;

public class StudentB implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Teacher teacher=(Teacher)o;
		System.out.println("学生B说老师的电话号码为："+teacher.getNumber());
	}

}
