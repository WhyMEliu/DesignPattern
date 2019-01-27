package com.java.peng.design.pattern.behavioral.strategy;

public class LiJianPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("立减促销");
	}

}
