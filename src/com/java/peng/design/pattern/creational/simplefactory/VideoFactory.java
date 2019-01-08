package com.java.peng.design.pattern.creational.simplefactory;

public class VideoFactory {
	
	/*public static Video getVideo(String type){
		if("java".equalsIgnoreCase(type)){
			return new JavaVideo();
		}else if("python".equalsIgnoreCase(type)){
			return new PythonVideo();
		}
		return null;
	}*/
	
	//反射
	public static Video getVideo(Class c){
		Video video = null;
		try {
			video = (Video) Class.forName(c.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return video;
	}
	
}
