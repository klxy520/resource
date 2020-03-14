package com.xnky.taotao.build;

import com.xnky.taotao.builder.AmdCpu;
import com.xnky.taotao.builder.CPU;
import com.xnky.taotao.builder.Monitor;
import com.xnky.taotao.builder.OodvjMouse;
import com.xnky.taotao.builder.mouse;

public class ASUSComputerBuilder  extends ComputerBuilder{
	
	 public ASUSComputerBuilder() {
		computer.setName("华硕");
	}

	@Override
	public CPU assembleCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu("amdCPU");
	}

	@Override
	public Monitor assembleMonitor() {
		Monitor monitor=new Monitor();
		monitor.setBrand("华硕显示器");
		monitor.setName("华硕");
		return monitor;
	}

	@Override
	public mouse assembleHouse() {
		return new OodvjMouse("雷柏");
	}
   
}
