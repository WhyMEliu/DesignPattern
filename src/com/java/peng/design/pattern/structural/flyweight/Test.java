package com.java.peng.design.pattern.structural.flyweight;

//享元模式
//定义：提供了减少对象数量从而改善应用所需的对象结构的方式
//	运用共享技术有效地支持大量细粒度的对象

//类型：结构

//适用场景：常常用于系统底层的开发，以便解决系统的性能问题
//	系统有大量相似对象，需要缓冲池的场景

//优点：减少对象的创建，降低内存中对象的数量，降低系统的内存，提高效率
//	减少内存之外的其他资源占用

//缺点：关注内/外部状态，关注现场安全问题
//	使系统，程序的逻辑复杂化

//扩展：
//内部状态：内部自定义的状态
//外部状态：通过参数传入的状态

//相关的设计模式
//享元模式和代理模式
//享元模式和单例模式

//源码解析：
//jdk：Integer等 缓存使用
public class Test {
	private static final String departments[] = {"RD","QA","PM","BD"};
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			String department = departments[(int)(Math.random()* departments.length)];
			Manager manager = (Manager) EmployeeFactory.getManager(department);
			manager.report();
		}
	}
}
