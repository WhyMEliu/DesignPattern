package com.java.peng.design.principle.dependenceinversion;

public class FECourse implements ICourse {

	@Override
	public void studyCourse() {
		System.out.println("peng在学习前端技术");
	}
	
}
