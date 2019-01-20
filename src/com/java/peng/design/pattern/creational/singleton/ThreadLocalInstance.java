package com.java.peng.design.pattern.creational.singleton;

//线程单例
public class ThreadLocalInstance {
	private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
			= new ThreadLocal<ThreadLocalInstance>(){
		@Override
		protected ThreadLocalInstance initialValue(){
			return new ThreadLocalInstance();
		}
	};
	
	private ThreadLocalInstance(){
		
	}
	
	public static ThreadLocalInstance getInstance(){
		return threadLocalInstanceThreadLocal.get();
	}
}
