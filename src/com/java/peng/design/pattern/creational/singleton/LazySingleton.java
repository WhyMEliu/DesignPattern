package com.java.peng.design.pattern.creational.singleton;

//静态类加锁：相当于整个类加锁 （效率低下）
public class LazySingleton {
	private static LazySingleton lazySingleton = null;
	
	private LazySingleton (){
		
	}
	
	public synchronized static LazySingleton getInstance(){
		if(lazySingleton == null){
			lazySingleton = new LazySingleton ();
		}
		return lazySingleton;
	}
}
