package com.java.peng.design.pattern.creational.singleton;

public enum EnumInstance {
	INSTANCE{
		protected void printTest(){
			System.out.println("Peng print Test");
		}
	};
	
	protected abstract void printTest();
	private Object data;
	
	public Object getData(){
		return data;
	}
	
	public void setData(){
		this.data = data;
	}
	
	public static EnumInstance getInstance(){
		return INSTANCE;
	}
}
