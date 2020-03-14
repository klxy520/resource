package com.xnky.taotao.decorator.test.logger;

public class UpFileLogger extends SpecialLogger{

	public UpFileLogger(Logger logger) {
		super(logger);
	}

	@Override
	String specialHandle(String log) {
		if (log!=null&&log!="") {
			return log.toUpperCase();
		}
		return null;
	}

}
