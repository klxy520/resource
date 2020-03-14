package com.xnky.taotao.builder;

import java.io.Serializable;

public class Computer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CPU cpu;
	private mouse mouse;
	private  Monitor monitor;
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public mouse getMouse() {
		return mouse;
	}
	public void setMouse(mouse mouse) {
		this.mouse = mouse;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	
}
