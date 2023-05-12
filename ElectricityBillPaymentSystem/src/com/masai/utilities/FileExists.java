package com.masai.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.masai.entities.Bill;
import com.masai.entities.Consumer;
import com.masai.entities.Transaction;

public class FileExists {
	public static Map<String, Bill> billFile() {
		Map<String, Bill> bFile = null;
		File f = new File("Bill.ser");
		boolean flag = f.exists();
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}
			if (flag) {
				bFile = new LinkedHashMap<>();
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(bFile);
				return bFile;
			} else {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				bFile = (Map<String, Bill>) ois.readObject();
				return bFile;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return bFile;
	}

	public static Map<String, Consumer> consumerFile() {
		Map<String, Consumer> cFile = null;
		File f = new File("Consumer.ser");
		boolean flag = f.exists();
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}
			if (flag) {
				cFile = new LinkedHashMap<>();
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(cFile);
				return cFile;
				
			} else {
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);
				cFile = (Map<String, Consumer>) ois.readObject();
				return cFile;
				
		}} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return cFile;

	}

	public static List<Transaction> transactionFile() {
		List<Transaction> tFile = null;
		File f = new File("Transaction.ser");
		boolean flag = f.exists();
		try {
			if (!f.exists()) {
				f.createNewFile();
				flag = true;
			}
			if (flag) {
				tFile = new ArrayList<>();
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
				oos.writeObject(tFile);
				return tFile;
			} else {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				tFile = (List<Transaction>) ois.readObject();
				return tFile;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return tFile;
	}
}
