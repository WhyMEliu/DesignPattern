package com.java.peng.design.principle.demeter;

public class Boss {
	public void commandCheckNumber(TeamLeader teamLeader){
		teamLeader.checkNumberOfCourse();
	}
}
