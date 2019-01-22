package com.java.peng.design.pattern.structural.decorator;

//装饰者模式
//定义：在不改变原有对象的基础之上，将功能附加到对象上
//	提供了比继承更有弹性的替代方案（扩展原有的功能对象）

//类型：结构型

//适用场景：扩展一个类的功能或给一个类添加附加职责
//	动态的给一个对象添加功能，这些功能可以再动态的撤销

//优点：继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
//	通过使用不同的装饰类以及这些装饰类的排列组合，可以实现不同效果
//	符合开闭原则

//缺点：会出现更多的代码，更多的类，增加程序的复杂性
//	动态装饰时，多层装饰时会更复杂

//相关设计模式：
//装饰者模式和代理模式：
//装饰者模式和代理模式：

//jdk:IO流
public class Test {
	public static void main(String[] args) {
		ABattercake aBattercake;
		aBattercake = new Battercake();
		aBattercake = new EggDecorator(aBattercake);
		aBattercake = new EggDecorator(aBattercake);
		aBattercake = new SausageDecorator(aBattercake);
		System.out.println(aBattercake.getDesc() + " 销售价格：" + aBattercake.cost());
	}
}
