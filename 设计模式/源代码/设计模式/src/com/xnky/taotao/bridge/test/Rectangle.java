package com.xnky.taotao.bridge.test;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}
	 public void coloring() {
		  System.out.print("画长方形");
		  super.coloring();
	   }
}
