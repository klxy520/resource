package com.xnky.taotao.decorator.test.logger;

public class XMLFileLogger extends SpecialLogger{

	public XMLFileLogger( Logger logger) {
		super(logger);
	}

	@Override
	String specialHandle(String log) {
		System.out.println("XML'");
		return null;
	}

}
