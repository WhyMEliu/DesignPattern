package com.java.peng.design.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

//访问者模式
//定义：封装作用于某数据结构（如List/Set/Map等）中的各元素的操作
//	可以在不改变各元素的类的前提下，定义作用于这些元素的操作

//类型：行为型

//适用场景：一个数据结构如（List/Set/Map等）包含很多类型对象
//	数据结构与数据操作分离

//优点：增加新的操作很容易，即增加一个新的访问者

//缺点：增加新的数据结构困难
//	具体元素变更比较麻烦

//相关的设计模式
//迭代器模式
public class Test {
	public static void main(String[] args) {
		List<Course> courseList = new ArrayList<>();
		
		FreeCourse freeCourse = new FreeCourse();
		freeCourse.setName("SpringMVC数据绑定");
		
		CodingCourse codingCourse = new CodingCourse();
		codingCourse.setName("Java设计模式 -- Peng");
		codingCourse.setPrice(998);
		
		courseList.add(codingCourse);
		courseList.add(freeCourse);
		
		for (Course course : courseList) {
			course.accept(new Visitor());
		}
	}
}
