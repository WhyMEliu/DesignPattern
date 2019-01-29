package com.java.peng.design.pattern.behavioral.chainofresponsibility;

//责任链模式
//定义：为请求创建一个接收此次请求对象的链

//类型：行为型

//适用场景：一个请求的处理需要多个对象当中的一个或几个写作处理

//优点：请求的发送者和接收者（请求的处理）解耦
//	责任链可以动态的组合

//缺点：责任链太长或者处理时间过长，影响性能
//	责任链有可能过多

//相关设计模式
// 状态模式
public class Test {
	public static void main(String[] args) {
		 Approver articleApprover = new ArticleApprover();
		 Approver videoApprover = new VideoApprover();
		 
		 Course course = new Course();
		 course.setName("Java设计模式 -- Peng");
		 course.setArticle("Java设计模式手记");
		 course.setVideo("Java设计模式视频");
		 
		 articleApprover.serNextApprover(videoApprover);
		 articleApprover.deploy(course);
	}
}
