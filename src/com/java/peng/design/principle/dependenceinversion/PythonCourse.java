package com.java.peng.design.principle.dependenceinversion;

public class PythonCourse implements ICourse {

	@Override
	public void studyCourse() {
		System.out.println("peng在学校Python课程");
	}
	
}
