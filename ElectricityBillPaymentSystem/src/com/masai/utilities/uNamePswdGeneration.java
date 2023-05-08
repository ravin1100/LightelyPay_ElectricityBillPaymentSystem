package com.masai.utilities;

public class uNamePswdGeneration {
	public static String usernameGenerate(String name) {
		int temp= (int)(Math.random()*10000);
		return name+""+temp;
	}
	public static int pswdGenerate() {
		return (int)(Math.random()*1000000);
	}
}
