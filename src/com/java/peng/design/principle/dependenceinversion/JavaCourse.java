package com.java.peng.design.principle.dependenceinversion;

public class JavaCourse implements ICourse{

	@Override
	public void studyCourse() {
		System.out.println("peng在学校java课程");
	}

}
