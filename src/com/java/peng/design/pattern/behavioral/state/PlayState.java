package com.java.peng.design.pattern.behavioral.state;

public class PlayState extends CourseVideoState {

	@Override
	public void play() {
		System.out.println("正常播放");
	}

	@Override
	public void speed() {
		super.courseVideoContext.setCourseVideoState(courseVideoContext.SPEED_STATE);
	}

	@Override
	public void pause() {
		super.courseVideoContext.setCourseVideoState(courseVideoContext.PAUSE_STATE);
	}

	@Override
	public void stop() {
		super.courseVideoContext.setCourseVideoState(courseVideoContext.STOP_STATE);
	}

}
