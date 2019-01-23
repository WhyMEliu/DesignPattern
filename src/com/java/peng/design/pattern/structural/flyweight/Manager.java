package com.java.peng.design.pattern.structural.flyweight;

public class Manager implements Employee {

	private String title = "部门经理";
	private String department;
	private String reportContent;
	
	public Manager(String department) {
		this.department = department;
	}

	@Override
	public void report() {
		System.out.println(reportContent);
	}

	public void setReportContent(String reportContent) {
		this.reportContent = reportContent;
	}
	
}
