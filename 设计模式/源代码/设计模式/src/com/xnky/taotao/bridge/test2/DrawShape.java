package com.xnky.taotao.bridge.test2;

public class DrawShape {
    public static void main(String[] args) {
		Shape shape=new Circle("com.xnky.taotao.bridge.test.RedColor");
		shape.coloring();
		System.out.println("==============");
		shape=new Rectangle("com.xnky.taotao.bridge.test.BlackColor");;
		shape.coloring();
	}
}
