package com.xnky.taotao.build;

import com.xnky.taotao.builder.CPU;
import com.xnky.taotao.builder.IntelCpu;
import com.xnky.taotao.builder.LenovoMouse;
import com.xnky.taotao.builder.Monitor;
import com.xnky.taotao.builder.mouse;

/**
 * 联想电脑建造者
 * @author 孙雪锋
 *
 */
public class LenovoComputerBuider extends ComputerBuilder{

 public LenovoComputerBuider() {
	 computer.setName("联想");
 }
	@Override
	public CPU assembleCpu() {
		return new IntelCpu();
	}

	@Override
	public Monitor assembleMonitor() {
		// TODO Auto-generated method stub
		Monitor monitor=new Monitor();
		monitor.setBrand("联想显示器");
		monitor.setName("G480");
		return monitor;
	}

	@Override
	public mouse assembleHouse() {
		// TODO Auto-generated method stub
		return new LenovoMouse("联想鼠标");
	}

}
