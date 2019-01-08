package com.java.peng.design.pattern.creational.simplefactory;

//简单工厂模式
//定义：由一个工厂对象决定创建出哪种产品类的实例
//类型：创建型，但不属于GOF23种设计模式

//使用场景：
//工厂类负责创建的对象比较少
//客户端（应用层）只知道传入工厂类的参数，对于如何创建对象（逻辑）不关心

//优点：
//只需要传入一个正确的参数，就可以获取你所需要的对象而无需要知道其创建细节

//缺点：
//工厂的职责过重，增加新的产品  需要修改工厂类的判断逻辑，违背开闭原则
public class Test {

	/*public static void main(String[] args) {
		Video video =  VideoFactory.getVideo("java");
		video.produce();
		Video video1 =  VideoFactory.getVideo("python");
		video1.produce();
	}*/

	public static void main(String[] args) {
		Video video = VideoFactory.getVideo(JavaVideo.class);
		video.produce();
		Video video1 = VideoFactory.getVideo(PythonVideo.class);
		video1.produce();
	}
}
