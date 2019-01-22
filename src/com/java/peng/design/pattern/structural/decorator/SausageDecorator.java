package com.java.peng.design.pattern.structural.decorator;

public class SausageDecorator extends AbstractDecorator {

	public SausageDecorator(ABattercake aBattercake) {
		super(aBattercake);
	}

	@Override
	protected void doSomething() {
		
	}

	@Override
	protected String getDesc() {
		return super.getDesc() + " 加一个香肠";
	}
	
	@Override
	protected int cost() {
		return super.cost() + 2;
	}
	
	
}
