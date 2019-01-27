package com.java.peng.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
	private static Map<String, PromotionStrategy> POROMOTION_STRATEGY_MAP = new HashMap<String, PromotionStrategy>();
	
	static{
		POROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
		POROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
		POROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
	}
	
	private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();
	
	private PromotionStrategyFactory(){
		
	}
	
	public static PromotionStrategy getPromotionStrategy(String promotionKey){
		PromotionStrategy promotionStrategy = POROMOTION_STRATEGY_MAP.get(promotionKey);
		return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
	}
	
	private interface PromotionKey{
		String LIJIAN = "LIJIAN";
		String FANXIAN = "FANXIAN";
		String MANJIAN = "MANJIAN";
	}
}
