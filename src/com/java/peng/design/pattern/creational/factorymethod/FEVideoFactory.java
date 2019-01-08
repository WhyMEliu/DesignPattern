package com.java.peng.design.pattern.creational.factorymethod;

public class FEVideoFactory extends VideoFactory {

	@Override
	public Video getVideo() {
		return new FEVideo();
	}

}
