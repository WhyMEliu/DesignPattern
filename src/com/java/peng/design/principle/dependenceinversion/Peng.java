package com.java.peng.design.principle.dependenceinversion;

public class Peng {
	
	public void studyCourse(ICourse iCourse){
		iCourse.studyCourse();
	}
	
}
