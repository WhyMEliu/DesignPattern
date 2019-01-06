package com.java.peng.design.principle.dependenceinversion;

//依赖倒置原则
//高层不依赖底层实现
//面向接口编程
//同时符合开闭原则
public class Test {
	public static void main(String[] args) {
		Peng peng = new Peng();
		peng.studyCourse(new JavaCourse());
		peng.studyCourse(new FECourse());
		peng.studyCourse(new PythonCourse());
	}
}
