package com.java.peng.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

//容器单例(有并发问题)：建议在类加载的时候进行单例容器的数据初始化
//不建议用hashtable效率低下
//currentHashMap直接使用 也是具有一定的风险
public class ContianerSingleton {
	
	private ContianerSingleton(){
		
	}
	private static Map<String, Object> singletonMap = new HashMap<>();
	
	public static void putInstance(String key, Object instance){
		if(StringUtils.isNotBlank(key) && instance != null){
			if(!singletonMap.containsKey(key)){
				singletonMap.put(key, instance);
			}
		}
	}
	
	public static Object getInstance(String key){
		return singletonMap.get(key);
	}
}
