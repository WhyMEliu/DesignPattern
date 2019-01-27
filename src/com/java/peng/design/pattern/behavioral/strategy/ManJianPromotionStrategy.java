package com.java.peng.design.pattern.behavioral.strategy;

public class ManJianPromotionStrategy implements PromotionStrategy {

	@Override
	public void doPromotion() {
		System.out.println("满减促销");
	}

}
