package com.java.peng.design.principle.singleresponsibility;

//方法的单一职责原则
public class Method {
	private void updateUsername(String name){
		name = "peng";
	}
	private void updateUserAddress(String address){
		address = "北京";
	}
	
	private void updateUserInfo(String name, String address, boolean bool){
		if(bool){
			name = "peng";
		}else{
			address = "北京";
		}
	}
}
