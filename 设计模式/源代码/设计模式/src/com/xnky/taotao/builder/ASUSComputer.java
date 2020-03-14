package com.xnky.taotao.builder;

public class ASUSComputer  extends AssembleComputer{

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
