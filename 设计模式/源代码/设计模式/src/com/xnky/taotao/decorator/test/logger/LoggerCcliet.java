package com.xnky.taotao.decorator.test.logger;

public class LoggerCcliet {

	public static void main(String[] args) {
		Logger  logger=new FlieLogger();
		logger.log("aaaaaaaaaaaaaaaa");
       logger= new UpFileLogger(logger);
       logger.log("aaaaaaaaaaaaaaaa");
	}

}
