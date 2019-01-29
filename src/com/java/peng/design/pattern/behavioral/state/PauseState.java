package com.java.peng.design.pattern.behavioral.state;

public class PauseState extends CourseVideoState {

	@Override
	public void play() {
		super.courseVideoContext.setCourseVideoState(courseVideoContext.PLAY_STATE);
	}

	@Override
	public void speed() {
		super.courseVideoContext.setCourseVideoState(courseVideoContext.SPEED_STATE);
	}

	@Override
	public void pause() {
		System.out.println("暂定播放");
	}

	@Override
	public void stop() {
		super.courseVideoContext.setCourseVideoState(courseVideoContext.STOP_STATE);
	}

}
