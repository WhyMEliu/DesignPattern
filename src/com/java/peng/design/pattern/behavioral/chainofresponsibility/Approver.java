package com.java.peng.design.pattern.behavioral.chainofresponsibility;

public abstract class Approver {
	protected Approver approver;
	
	public void serNextApprover(Approver approver){
		this.approver = approver;
	}
	
	public abstract void deploy(Course course);
}
