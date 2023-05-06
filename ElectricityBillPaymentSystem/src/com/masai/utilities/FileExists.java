package com.masai.utilities;

import java.io.File;
import java.util.Map;

import com.masai.entities.Bill;

public class FileExists {
	public static Map<Integer, Bill> billFile() {
		Map<Integer, Bill> bFile = null;
		File f = new File("bill.ser");
		boolean flag=false;
		if(!f.exists()) {
			f.createNewFile();
			flag=true;
		}
		if(flag) {
			
		}
	}
}
