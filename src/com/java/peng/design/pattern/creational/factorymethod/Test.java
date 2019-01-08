package com.java.peng.design.pattern.creational.factorymethod;

//工厂方法模式
//定义：定义一个创建对象的接口
//	  但让实现这个接口的类来决定实例化哪个类
//	 工厂方法让类的实例化推迟到子类中进行
//类型：创建型

//适用场景：创建对象需要大量重复的代码
//		 客户端（应用层）不依赖于产品实例如何被创建，实现等细节
//		 一个类通过其子类来指定创建哪个对象

//优点：用户只需要关心所需产品对应的工厂，无需关心创建细节
//	     加入新产品符合开闭原则，提高可扩展性

//缺点：类的个数容易过多，增加复杂度
//	     增加了系统的抽象性和理解难度

public class Test {
	
	public static void main(String[] args) {
		VideoFactory videoFactory = new JavaVideoFactory();
		videoFactory.getVideo().produce();
		VideoFactory videoFactory1 = new PythonVideoFactory();
		videoFactory1.getVideo().produce();
		VideoFactory videoFactory2 = new FEVideoFactory();
		videoFactory2.getVideo().produce();
	}
	
}
