package com.java.peng.design.principle.liskovsubstitution;

public class Square implements Quadrangle {
	
	private long sideLength;
	
	@Override
	public long getWidth() {
		return this.sideLength;
	}

	@Override
	public long getLength() {
		return this.sideLength;
	}

	public long getSideLength() {
		return sideLength;
	}

	public void setSideLength(long sideLength) {
		this.sideLength = sideLength;
	}
	
	
}
