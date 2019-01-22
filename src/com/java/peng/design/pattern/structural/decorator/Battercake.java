package com.java.peng.design.pattern.structural.decorator;

public class Battercake extends ABattercake {

	@Override
	protected String getDesc() {
		return "煎饼";
	}

	@Override
	protected int cost() {
		return 8;
	}
	
}
