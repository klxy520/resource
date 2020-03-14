package com.xnky.taotao.bridge.test2;

public class Rectangle extends Shape {

	public Rectangle(String className) {
		super(className);
	}
	 public void coloring() {
		  System.out.print("画长方形");
		  super.coloring();
	   }
}
