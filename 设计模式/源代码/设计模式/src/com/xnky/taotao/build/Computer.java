package com.xnky.taotao.build;

import java.io.Serializable;

import com.xnky.taotao.builder.CPU;
import com.xnky.taotao.builder.Monitor;
import com.xnky.taotao.builder.mouse;

//笔记本电脑
public class Computer  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void show() {
		System.out.println("该电脑是:"+name+"电脑");
		cpu.show();
		mouse.show();
		monitor.show();
	}
}
