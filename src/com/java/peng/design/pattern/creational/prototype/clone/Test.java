package com.java.peng.design.pattern.creational.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Date birthday =  new Date(0l);
		Pig pig1 = new Pig("佩奇", birthday);
		Pig pig2 = (Pig)pig1.clone();
		System.out.println(pig1);
		System.out.println(pig2);

		pig1.getBirthday().setTime(66666666666L);
		
		System.out.println(pig1);
		System.out.println(pig2);		
		
		//clone破坏单例（可以不实现Cloneable接口或者重写clone方法，保证单例）
		/*HungrySingleton hungrySingleton = HungrySingleton.getInstance();
		Method method = hungrySingleton.getClass().getDeclaredMethod("clone");
		method.setAccessible(true);
		HungrySingleton cloneHungrySingleton = (HungrySingleton) method.invoke(hungrySingleton);
		System.out.println(hungrySingleton);
		System.out.println(cloneHungrySingleton);*/
	}
}
