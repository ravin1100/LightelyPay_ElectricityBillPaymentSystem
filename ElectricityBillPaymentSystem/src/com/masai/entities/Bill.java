package com.masai.entities;

import java.io.Serializable;

public class Bill extends User implements Serializable {
	
	private int units;
	private int rate;
	private int totalBillAmount;
	private String dueDate;
	private String status;
	
	public Bill(int units, int rate, int totalBillAmount, String dueDate, String status) {
		super();
		this.units = units;
		this.rate = rate;
		this.totalBillAmount = totalBillAmount;
		this.dueDate = dueDate;
		this.status = status;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getTotalBillAmount() {
		return totalBillAmount;
	}

	public void setTotalBillAmount(int totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Bill [units=" + units + ", rate=" + rate + ", totalBillAmount=" + totalBillAmount + ", dueDate="
				+ dueDate + ", status=" + status + "]";
	}

	

	
	
}
