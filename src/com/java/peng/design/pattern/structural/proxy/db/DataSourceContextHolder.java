package com.java.peng.design.pattern.structural.proxy.db;

public class DataSourceContextHolder {
	private static ThreadLocal<String> CONTNEXT_HOLDER = new ThreadLocal<>();
	
	public static void setDBType(String dbType){
		CONTNEXT_HOLDER.set(dbType);		
	}
	
	public static String getDBType(){
		return (String)CONTNEXT_HOLDER.get();
	}
	
	public static void clearDBType(){
		CONTNEXT_HOLDER.remove();
	}
}
