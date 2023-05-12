package com.masai.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Transaction implements Serializable {
	private String username;
	private String email;
	private int billId;
	private double amount;
	private LocalDate dt;
	
	public Transaction() {
		super();
	}

	public Transaction(String username, String email, int billId, double amount, LocalDate dt) {
		super();
		this.username = username;
		this.email = email;
		this.billId = billId;
		this.amount = amount;
		this.dt = dt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDt() {
		return dt;
	}

	public void setDt(LocalDate dt) {
		this.dt = dt;
	}

	@Override
	public String toString() {
		return "Transaction [username=" + username + ", email=" + email + ", billId=" + billId + ", amount=" + amount
				+ ", dt=" + dt + "]";
	}
	
	
	
}
