package com.java.peng.design.pattern.creational.singleton;

//双重验证，当没有并发时 不进行加锁操作
//双重验证的时候防止指令重排 需要对并发操作 加  volatile（可见性）
public class LazyDoubleCheckSingleton {
private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
	
	private LazyDoubleCheckSingleton (){}
	
	public synchronized static LazyDoubleCheckSingleton getInstance(){
		
		if(lazyDoubleCheckSingleton == null){
			synchronized (LazyDoubleCheckSingleton.class) {
				if(lazyDoubleCheckSingleton == null){
					lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton ();
				}
			}
		}
		return lazyDoubleCheckSingleton;
	}
}
