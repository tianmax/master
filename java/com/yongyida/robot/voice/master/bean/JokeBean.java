package com.yongyida.robot.voice.master.bean;


public class JokeBean  extends BaseBean{
	public Semantic semantic;
	
	public class Semantic{
		public Slots slots;
	}
	
	public class Slots{
		public String type;
	}
}
