package com.java.peng.design.principle.compositionaggregation;

//合成（组合原则）
//定义：尽量使用对象组合/聚合，而不是继承的关系达到软件复用的目的
//聚合has-A和组合contains-A
//优点：可以使系统更加灵活，降低类与类之间的耦合度
//	  一个类的变化对其他类造成的影响相对较少
public class Test {
	public static void main(String[] args) {
		ProductDao productDao = new ProductDao();
		productDao.setDbConnection(new MySQLConnection());
		productDao.addProduct();
	}

}
