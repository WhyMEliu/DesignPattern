package com.java.peng.design.principle.liskovsubstitution;


public class Rectangle implements Quadrangle {
	private long length;
	private long width;
	
	@Override
	public long getWidth() {
		return this.width;
	}
	
	@Override
	public long getLength() {
		return this.length;
	}

	public void setLength(long length) {
		this.length = length;
	}
	
	public void setWidth(long width) {
		this.width = width;
	}
	
	
}
