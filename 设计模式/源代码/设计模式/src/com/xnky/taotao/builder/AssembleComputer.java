package com.xnky.taotao.builder;
/**
 * 笔记本电脑组装工程
 * @author 孙雪锋
 *
 */
public abstract class AssembleComputer {

	public Computer assemble() {
		Computer computer=new Computer();
		computer.setCpu(assembleCpu());
		computer.setMonitor(assembleMonitor());
		computer.setMouse(assembleHouse());
		return computer;
	}
	public abstract CPU assembleCpu();
	
	public abstract Monitor assembleMonitor();
	public abstract mouse assembleHouse();
	
}
