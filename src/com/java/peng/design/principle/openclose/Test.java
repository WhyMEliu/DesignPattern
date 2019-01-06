package com.java.peng.design.principle.openclose;

public class Test {
	public static void main(String[] args) {
		ICourse iCourse = new JavaDiscountCourse(001, "Hello World~", 300d);
		JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;
		System.out.println("课程ID:" + javaCourse.getId() + " 课程名称:" + javaCourse.getName() + " 课程原价:" + javaCourse.getPrice() + " 课程折后价格:" + javaCourse.getDiscountPrice() + "元");
	}
}
