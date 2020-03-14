package com.xnky.taotao.bridge.test;

public abstract class Shape {
	private Color color;
	public Shape(Color color) {
		this.color=color;
	}
	protected void coloring() {
		System.out.println(" 涂:"+color.Coloring());
	}
}
