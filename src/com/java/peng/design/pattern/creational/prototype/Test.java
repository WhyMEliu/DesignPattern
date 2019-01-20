package com.java.peng.design.pattern.creational.prototype;

//原型模式
//定义：指原型实例指定的创建对象的种类，并且通过拷贝这些原型创建新的对象
//	     不需要知道任何创建的细节，不能调用构造函数

//类型：创建型

//使用场景：类的初始化消耗较多的资源
//		 new产生的一个对象需要非常繁琐的过程（数据准备，访问权限等）
//		   构造函数比较复杂
//		   循环体中产生大量对象时

//缺点：必须配备克隆方法
//	  对克隆复杂对象或对克隆出的对象进行复杂改造时，容易引入风险
//	  深拷贝，浅拷贝要运用得当

//原型扩展
//深拷贝：拷贝对象时所有的实现cloneable的对象都进行重写
//浅拷贝：只拷贝当前对象，不拷贝对象的对象属性
public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		Mail mail = new Mail();
		mail.setContent("初始化模板");
		System.out.println("初始化mail:"+mail);
		for (int i = 0; i < 10; i++) {
			Mail mailTemp = (Mail) mail.clone();
			mail.setName("姓名"+i);
			mail.setEmailAddress("姓名"+i+"@qq.com");
			mail.setContent("恭喜您中奖了");
			MailUtil.sendMail(mailTemp);
			System.out.println("克隆的mailTemp:"+mailTemp);
		}
		MailUtil.saveOriginMailRecord(mail);
	}
}
