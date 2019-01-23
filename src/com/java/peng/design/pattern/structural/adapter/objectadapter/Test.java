package com.java.peng.design.pattern.structural.adapter.objectadapter;

//对象适配器
public class Test {
	public static void main(String[] args) {
		Target target = new ConcreteTarget();
		target.request();
		
		Target adapterTarget = new Adapter();
		adapterTarget.request();
	}
	
}
