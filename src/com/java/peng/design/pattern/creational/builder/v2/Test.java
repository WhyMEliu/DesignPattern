package com.java.peng.design.pattern.creational.builder.v2;


//改进版~不过建造的设计是无序，可以进行链表添加属性
public class Test {
	public static void main(String[] args) {
		Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲")
				.buildCoursePPT("Java设计模式精讲PPT")
				.buildCourseVideo("Java设计模式精讲视频").build();
		System.out.println(course);
	}
}
