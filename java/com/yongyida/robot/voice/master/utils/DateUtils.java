package com.yongyida.robot.voice.master.utils;

import java.text.SimpleDateFormat;

public class DateUtils {
	public static String timestamp2String(long timestamp){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(timestamp);
	}
}
