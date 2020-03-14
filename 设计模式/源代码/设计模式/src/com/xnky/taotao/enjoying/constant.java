package com.xnky.taotao.enjoying;

public abstract class constant {
	private String constantName;
	private String name;
	public String getConstantName() {
		return constantName;
	}
	public void setConstantName(String constantName) {
		this.constantName = constantName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
       abstract void show();
	public constant(String constantName) {
		super();
		this.constantName = constantName;
	}
       
}
