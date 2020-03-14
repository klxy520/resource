package com.xnky.taotao.decorator.test.logger;

public class ConsoleLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("原来的日志为:"+log);
	}

}
