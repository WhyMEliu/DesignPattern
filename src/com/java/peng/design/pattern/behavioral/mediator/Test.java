package com.java.peng.design.pattern.behavioral.mediator;

//中介者模式
//定义：定义一个封装一组对象如何交互的对象
//	通过使对象明确地相互引用来促进松散耦合，并允许独立地改变它们的交互

//类型：行为型

//适用场景：系统中对象之间存在复杂的引用关系，产生的相互依赖关系结构混乱且难以理解
//	交互的公共行为，如果需要改变行为则可以增加新的中介者类

//优点：将一对多转化成了一对一，降低程序复杂度
//	类之间解耦

//缺点：中介者过多，导致系统复杂

//相关设计模式
//观察者模式：提供中介者之间的交互
public class Test {
	public static void main(String[] args) {
		User peng = new User("Peng");
		User tom = new User("Tom");
		
		peng.sendMessage("Hi~");
		tom.sendMessage("Hello~");
	}
}
