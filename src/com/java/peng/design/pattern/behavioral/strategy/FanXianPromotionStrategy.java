package com.java.peng.design.pattern.behavioral.strategy;

public class FanXianPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("返现促销");
	}

}
