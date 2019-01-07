package com.java.peng.design.principle.liskovsubstitution.methodoutput;

//含义4：当子类的方法实现父类的方法时（重写/重载或实现抽象方法），
//方法的后置条件（即方法的输出/返回值）要比父类更严格或相等。
public class Test {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.method());
	}
}
