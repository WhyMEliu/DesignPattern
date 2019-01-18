package com.java.peng.design.pattern.creational.singleton;

//静态内部类单例实现
//静态类部类 在初始化时 会有初始化锁 可以防止并发
public class StaticInnerClassSingleton {
	
	private static class InnerClass{
		private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton(); 
	}
	
	private StaticInnerClassSingleton (){};
	
	public static StaticInnerClassSingleton getInstance() {
		return InnerClass.staticInnerClassSingleton;
	}
	
}
