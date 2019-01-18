package com.java.peng.design.pattern.creational.singleton;

import java.io.Serializable;

//饿汉单例模式
//类加载时就已经进行创建
public class HungrySingleton implements Serializable {
	private final static HungrySingleton hungrySingleton;
	
	static{
		hungrySingleton = new HungrySingleton();
	}
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return hungrySingleton;
	}
	
	//防止序列化问题
	private Object readResolve(){
		return hungrySingleton;
	}
}
