package com.java.peng.design.pattern.structural.proxy;

//代理模式
//定义：为其它对象提供一种代理，以控制对整个对象的访问
//	代理对象在客户端和目标对象之间起到中介的作用

//类型：结构型

//适用场景：保护目标对象
//	增强目标对象

//优点：代理模式能将代理对象与真实被调用的目标对象分离
//	一定程度上降低了系统的耦合度，扩展性好
//	保护目标对象
//	增强目标对象

//缺点：代理模式会造成系统设计中类的数目增加
//	在客户端和目标对象增加一个代理对象，会造成请求处理的速度变慢
//	增加系统的复杂度

//扩展
//静态代理：
//动态代理：
//CGLib代理：

//Spring代理选择：
//当Bean有实现接口时，Spring就会用JDK的动态代理
//当Bean没有实现接口时，Spring使用CGlib
//可以强制使用CGlib:
//	在spring配置中加入<aop:aspectj-autoproxy proxy-target-class="true"/>

//CGlib代理比 JDK动态代理速度慢20%

//相关设计模式
//装饰者模式：
//适配器模式：
public class Test {
	
}
