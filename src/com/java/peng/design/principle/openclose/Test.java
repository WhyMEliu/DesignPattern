package com.java.peng.design.principle.openclose;

//开闭原则
//定义：一个软件实体如类，模块和函数应该对扩展开放，对修改关闭
//	用抽象构建框架，用实现扩展细节

//优点：提高软件系统的可复用性及可维护性
public class Test {
	public static void main(String[] args) {
		ICourse iCourse = new JavaDiscountCourse(001, "Hello World~", 300d);
		JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
		System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName() + " 课程原价:" + javaCourse.getPrice() + " 课程折后价格:" + javaCourse.getDiscountPrice() + "元");
	}
}
