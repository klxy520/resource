package com.xnky.taotao.decorator.test.logger;
/**
 *特殊日志功能
 * @author 孙雪锋
 *
 */
public abstract class SpecialLogger implements Logger {
	private Logger Logger;

	public SpecialLogger(Logger logger) {
		this.Logger = logger;
	}

	@Override
	public void log(String log) {
		log = specialHandle(log);
		Logger.log(log);
	}

	abstract String specialHandle(String log);
}
