package com.masai.utilities;

public class uNamePswdGeneration {
	public static String usernameGenerate(String name) {
		int temp = (int) (Math.random() * 10000);
		return name + "" + temp;
	}

	public static String pswdGenerate(String name) {
		int temp = (int) (Math.random() * 1000);
		return name + "" + temp;
	}
}
