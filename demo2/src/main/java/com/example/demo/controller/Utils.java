package com.example.demo.controller;

public class Utils {
	public static String getPath() {
		String os = System.getProperty("os.name");
		if (os.toLowerCase().startsWith("win")) { // 如果是Windows系统  https://blog.csdn.net/ajklaclk/article/details/80804137
			return "c:/uploadPdf/";
		} else { // linux 和mac
			return "/uploadPdf/";
		}
	}
	
	public static boolean IS_LOGINED = false;
}
