package com.java.peng.design.pattern.behavioral.command;

//命令模式
//定义：将“请求”封装成对象，以便使用不同的请求
//	命令模式解决了应用程序中对象的职责以及它们之间的通信方式

//类型：行为型

//适用场景：请求调用者和请求接收者需要解耦，使得调用者和接收者不直接交互
//	需要抽象出等待执行的行为

//优点：降低耦合
//	容易扩展新命令或者一组命令

//缺点：命令的无限扩展会增加类的数量，提高系统实现复杂度

//相关设计模式：
//备忘录模式：常一起使用
public class Test {
	public static void main(String[] args) {
		CourseVideo courseVideo = new CourseVideo("Java设计模式~");
		OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
		CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);
	
		Staff staff = new Staff();
		staff.addCommand(openCourseVideoCommand);
		staff.addCommand(closeCourseVideoCommand);
		
		staff.executeCommands();
	}
}
