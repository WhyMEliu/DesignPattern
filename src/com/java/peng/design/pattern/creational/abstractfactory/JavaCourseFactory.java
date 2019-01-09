package com.java.peng.design.pattern.creational.abstractfactory;

public class JavaCourseFactory implements CourseFactory {

	@Override
	public Video getVideo() {
		return new JavaVideo();
	}

	@Override
	public Article getArticle() {
		return new JavaArticle();
	}
	
}
