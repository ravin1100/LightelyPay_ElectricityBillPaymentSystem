package com.masai.entities;

import java.io.Serializable;

public class Consumer extends User implements Serializable {

	private String userName;
	private String password;
	private int walletBalance;

	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consumer(String firstName, String lastName, String address, int mobileNumber, String email, String userName,
			String password, int walletBalance) {
		super(firstName, lastName, address, mobileNumber, email);
		this.userName = userName;
		this.password = password;
		this.walletBalance = walletBalance;
	}

	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(int walletBalance) {
		this.walletBalance = walletBalance;
	}

	@Override
	public String toString() {
		return "Consumer [userName=" + userName + ", password=" + password + ", walletBalance=" + walletBalance
				+ ", FirstName=" + getFirstName() + ", LastName=" + getLastName() + ", Address="
				+ getAddress() + ", MobileNumber=" + getMobileNumber() + ", Email=" + getEmail() + "]";
	}

	

//	@Override
//	public String toString() {
//		return "Consumer [userName=" + userName + ", walletBalance=" + walletBalance + ", getUserName()="
//				+ getUserName() + ", getWalletBalance()=" + getWalletBalance() + ", getFirstName()=" + getFirstName()
//				+ ", getLastName()=" + getLastName() + ", getAddress()=" + getAddress() + ", getMobileNumber()="
//				+ getMobileNumber() + ", getEmail()=" + getEmail() + "]";
//	}

	

}
