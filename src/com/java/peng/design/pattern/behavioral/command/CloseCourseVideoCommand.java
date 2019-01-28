package com.java.peng.design.pattern.behavioral.command;

public class CloseCourseVideoCommand implements Command {
	private CourseVideo courseVideo;
	
	public CloseCourseVideoCommand(CourseVideo courseVideo) {
		super();
		this.courseVideo = courseVideo;
	}

	@Override
	public void execute() {
		courseVideo.close();
	}

}
