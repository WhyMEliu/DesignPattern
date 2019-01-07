package com.java.peng.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {

	@Override
	public Map method() {
		HashMap hashMap = new HashMap();
		System.out.println("子类method被执行");
		hashMap.put("message", "子类method被执行");
		return hashMap;
	}
	
}
