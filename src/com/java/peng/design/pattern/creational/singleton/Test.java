package com.java.peng.design.pattern.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//单例模式
//定义：保证一个类仅有一个实例，并提供一个全局访问点
//类型：创建型

//适用场景：想确保任何情况下都绝对只有一个实例

//优点：在内存里只有一个实例，减少了内存开销
//    可以避免对资源的多重占用
//	  设置全局访问点，严格控制访问

//缺点：没有接口，扩展困难

//重要：私有构造器，线程安全，延迟加载，反射
//序列化和反序列化安全:将该单例对象进行IO写入文件再次读取出来，会破坏单例模式，产生不同的对象（单例对象重写方法：readResolve）

//线程安全
//Double Check， 实现
//静态内部类 实现 

//相关设计模式
//单例模式和工厂模式
//单例模式和享元模式

public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	    /*Thread thread1 = new Thread(new T()) ;
		thread1.start();
		Thread thread2 = new Thread(new T()) ;
		thread2.start();
		System.out.println("~~~~~~~~~~~~~~~~");*/
		
		/*//序列化测试，是否破坏单例
		HungrySingleton instance = HungrySingleton.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hungrySingleton"));
		oos.writeObject(instance);
		
		File file = new File("hungrySingleton");
		ObjectInputStream ois = new ObjectInputStream (new FileInputStream(file));
		HungrySingleton newInstance = (HungrySingleton)ois.readObject();
		
		System.out.println(instance);
		System.out.println(newInstance);
		System.out.println(instance == newInstance);*/
		
		
	}
}
