package com.java.peng.design.pattern.structural.composite;

//组合模式
//定义：将对像组合成树形结构以表示“部分-整体”的层次结构
//	组合模式使客户端对单个对象和组合对象保持一致的方式处理

//类型：结构型

//使用场景：希望客户端可以忽略组合对象与单个对象的差异时
//	处理一个树形结构时

//优点：清楚地定义分层次的复杂对象，表示对的全部或部分层次
//	让客户端忽略了层次的差异，方便对整个层次结构进行控制
//	简化客户端代码

//缺点：限制类型时会较为复杂
//	使设计变得更加抽象

//相关设计模式
//组合模式和访问者模式

public class Test {
	public static void main(String[] args) {
		CatalogComponent linuxCourse = new Course("Linux课程",11);
		CatalogComponent windowsCourse = new Course("Windows课程",11);
		
		CatalogComponent javaCourseCatalog = new CourseCatalog("Java课程目录",2);
		
		CatalogComponent Course1 = new Course("java课程1",55);
		CatalogComponent Course2 = new Course("java课程2",66);
		CatalogComponent Course3 = new Course("java课程3",77);
		
		javaCourseCatalog.add(Course1);
		javaCourseCatalog.add(Course2);
		javaCourseCatalog.add(Course3);
		
		CatalogComponent mainCourseCatalog = new CourseCatalog("课程主目录",1);
		mainCourseCatalog.add(linuxCourse);
		mainCourseCatalog.add(windowsCourse);
		mainCourseCatalog.add(javaCourseCatalog);
		
		mainCourseCatalog.print();
	}
}
