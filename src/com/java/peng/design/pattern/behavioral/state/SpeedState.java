package com.java.peng.design.pattern.behavioral.state;

public class SpeedState extends CourseVideoState {

	@Override
	public void play() {
		super.courseVideoContext.setCourseVideoState(courseVideoContext.PLAY_STATE);
	}

	@Override
	public void speed() {
		System.out.println("加速播放");
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
