package com.xnky.taotao.enjoying;

import java.util.HashMap;
import java.util.Map;

public class ConstantFactory {
	Map<String, StirngConstant> map = new HashMap<String, StirngConstant>();

	public StirngConstant getConstant(String content) {
		if (!map.containsKey(content)) {
			StirngConstant stirngConstant = new StirngConstant(content);
			map.put(content, stirngConstant);
			return stirngConstant;
		}
		return map.get(content);
	}
	public int count() {
		return map.size();
	}
}
