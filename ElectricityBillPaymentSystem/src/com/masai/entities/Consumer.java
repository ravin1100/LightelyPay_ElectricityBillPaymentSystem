package com.masai.entities;

import java.io.Serializable;

public class Consumer extends User implements Serializable {

	private double walletBalance;

	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consumer(String firstName, String lastName, String address, int mobileNumber, String email,
			double walletBalance) {
		super(firstName, lastName, address, mobileNumber, email);
		// TODO Auto-generated constructor stub
		this.walletBalance = walletBalance;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	@Override
	public String toString() {
		return "Consumer [walletBalance=" + walletBalance + ", getWalletBalance()=" + getWalletBalance()
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getAddress()="
				+ getAddress() + ", getMobileNumber()=" + getMobileNumber() + ", getEmail()=" + getEmail() + "]";
	}
	

}
