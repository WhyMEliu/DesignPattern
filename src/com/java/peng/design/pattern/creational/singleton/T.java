package com.java.peng.design.pattern.creational.singleton;

public class T implements Runnable {

	@Override
	public void run() {
		//LazySingleton instance = LazySingleton.getInstance();
		StaticInnerClassSingleton instance =  StaticInnerClassSingleton.getInstance();
		System.out.println(Thread.currentThread().getName()+"  "+instance);
	}
	
}
