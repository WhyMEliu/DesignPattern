package com.java.peng.design.pattern.creational.builder;

//建造者模式
//定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
//	   用户只需要指定需要建造的类型就可以得到它们，建造过程及细节不需要知道
//类型：创建型

//适用场景：如果一个有非常复杂的内部结构（很多属性）
//		 想把复杂对象的创建与使用分离

//优点：封装性好，创建和使用分离
//	  扩展性好，建造类之间的独立，一定程度上解耦

//缺点：产生多余的builder对象
//    产品内部发生变化，建造者都要修改，成本较大

//源码：实例  StringBuilder
public class Test {
	public static void main(String[] args) {
		CourseBuilder courseBuilder = new CourseActualBuilder();
		Coach coach = new Coach();
		coach.setCourseBuilder(courseBuilder);
		Course course = coach.makerCourse("Java设计模式精讲", 
				"Java设计模式精讲PPT", 
				"Java设计模式精讲视频",
				"Java设计模式精讲手记",
				"Java设计模式精讲问答");
		System.out.println(course);
	}
}
