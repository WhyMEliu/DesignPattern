package com.java.peng.design.pattern.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

//策略模式
//定义：定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的用户
//	if...else...

//类型：行为型

//适用场景：系统有很多类，而他们的区别仅仅在于他们的行为不同
//	一个系统需要动态地在几种算法中选一种

//优点：开闭原则
//	避免使用多重条件转移语句
//	提高算法的保密性和安全性

//缺点：客户端必须知道所有的策略类，并自行决定使用哪一个策略类
//	产生很多策略类

//相关的设计模式
//工厂模式：
//状态模式：

public class Test {
	/*public static void main(String[] args) {
		PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
		PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
		
		promotionActivity618.executePromotionStrategy();
		promotionActivity1111.executePromotionStrategy();
	}*/
	
/*	public static void main(String[] args) {
		PromotionActivity promotionActivity = null;
		
		String promotionKey = "LIJIAN";
		if(StringUtils.equals(promotionKey, "LIJIAN")){
			promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
		} else if(StringUtils.equals(promotionKey, "FANXIAN")){
			promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
		}//......
		
		promotionActivity.executePromotionStrategy();
	}*/
	
	
	public static void main(String[] args) {
		String promotionKey = "MANJIAN";
		PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
		promotionActivity.executePromotionStrategy();
	}
	
}
