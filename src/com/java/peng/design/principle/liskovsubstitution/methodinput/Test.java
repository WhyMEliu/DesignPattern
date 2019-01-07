package com.java.peng.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

//含义3：当子类的方法重载父类的方法时，方法的前置条件
//	   （即方法的输入/入参）要比父类方法的输入参数更加宽松
public class Test {
	public static void main(String[] args) {
		Base child = new Child();
		HashMap hashMap = new HashMap();
		child.method(hashMap);
	}
}
