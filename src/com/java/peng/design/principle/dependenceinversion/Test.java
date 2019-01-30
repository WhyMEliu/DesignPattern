package com.java.peng.design.principle.dependenceinversion;

//依赖倒置原则
//定义：高层模块不应该依赖底层模块，二者都应该依赖其抽象
//	抽象不应该依赖细节；细节应该依赖抽象
//	针对接口编程，不要针对实现编程

//优点：可以减少类间的耦合性，提高稳定性，提高代码的可读性和可维护性，可降低修改程序所造成的风险
public class Test {
	public static void main(String[] args) {
		Peng peng = new Peng();
		peng.studyCourse(new JavaCourse());
		peng.studyCourse(new FECourse());
		peng.studyCourse(new PythonCourse());
	}
}
