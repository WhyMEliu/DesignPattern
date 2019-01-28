package com.java.peng.design.pattern.behavioral.observer;

//观察者模式
//定义：定义了对象之间的一对多的依赖，让多个观察者对象同时监听某一个主题对象
//当主题对象发生变化时，它的所有依赖着（观察者）都会就收到通知并更新

//类型：行为型

//适合场景：关联行为场景，建立一套触发机制

//优点：观察者和被观察者之间建立一个抽象的耦合
//	观察者模式支持广播通信

//缺点：观察者之间有过多的细节依赖，提高时间消耗及程序复杂度
//	使用要得当，要避免循环调用
public class Test {
	public static void main(String[] args) {
		Course course = new Course("Java设计模式");
		Teacher teacher1 = new Teacher("Alpha");
		Teacher teacher2 = new Teacher("WhymeLiu");
		
		course.addObserver(teacher1);
		course.addObserver(teacher2);
		
		//业务逻辑代码
		Question question = new Question();
		question.setUserName("peng");
		question.setQuestionContent("Java的主函数如何编写");
		
		course.produceQuestion(course, question);
	}
}
