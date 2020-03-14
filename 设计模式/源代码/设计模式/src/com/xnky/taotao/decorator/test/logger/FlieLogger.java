package com.xnky.taotao.decorator.test.logger;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlieLogger  implements Logger{

	@SuppressWarnings("resource")
	@Override
	public void log(String log) {
		DataOutputStream stream = null;
		try {
			 stream= new DataOutputStream(new FileOutputStream("d:/log.txt"));
		    stream.writeBytes(log+"\r\n");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (stream!=null) {
				try {
					stream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
