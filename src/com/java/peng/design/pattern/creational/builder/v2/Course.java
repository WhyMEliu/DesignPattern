package com.java.peng.design.pattern.creational.builder.v2;

public class Course {
	
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    
    //question & answer
    private String courseQA;
    
    public Course (CourseBuilder CourseBuilder){
    	this.courseName = CourseBuilder.courseName;
    	this.coursePPT = CourseBuilder.coursePPT;
    	this.courseVideo = CourseBuilder.courseVideo;
    	this.courseArticle = CourseBuilder.courseArticle;
    	this.courseQA = CourseBuilder.courseQA;
    }

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", coursePPT=" + coursePPT + ", courseVideo=" + courseVideo
				+ ", courseArticle=" + courseArticle + ", courseQA=" + courseQA + "]";
	}
    
    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;

        //question & answer
        private String courseQA;
        
    	public CourseBuilder buildCourseName(String courseName) {
    		this.courseName = courseName;
    		return this;
    	}

    	public CourseBuilder buildCoursePPT(String coursePPT) {
    		this.coursePPT = coursePPT;
    		return this;
    	}

    	public CourseBuilder buildCourseVideo(String courseVideo) {
    		this.courseVideo = courseVideo;
    		return this;
    	}

    	public CourseBuilder buildCourseArticle(String courseArticle) {
    		this.courseArticle = courseArticle;
    		return this;
    	}

    	public CourseBuilder buildCourseQA(String courseQA) {
    		this.courseQA = courseQA;
    		return this;
    	}

    	public Course build() {
    		return new Course(this);
    	}
    }
}
