package com.masai.entities;

import java.io.Serializable;
import java.time.LocalDate;

public class Bill extends User implements Serializable {
	
	private String userName;
//	private String name;
	private int units;
	private int rate;
	private int fixedCharge;
	private int totalBillAmount;
	private LocalDate dueDate;
	private String status;
	
	public Bill(String userName, int units, int rate, int fixedCharge, int totalBillAmount, LocalDate dueDate, String status) {
		super();
		
		this.userName=userName;
		this.units = units;
		this.rate = rate;
		this.fixedCharge=fixedCharge;
		this.totalBillAmount = totalBillAmount;
		this.dueDate = dueDate;
		this.status = status;
	}

	
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}


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

	public int getFixedCharge() {
		return fixedCharge;
	}

	public void setFixedCharge(int fixedCharge) {
		this.fixedCharge = fixedCharge;
	}

	public int getTotalBillAmount() {
		return totalBillAmount;
	}

	public void setTotalBillAmount(int totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
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
		return "Bill [userName=" + userName + ", units=" + units + ", rate=" + rate
				+ ", fixedCharge=" + fixedCharge + ", totalBillAmount=" + totalBillAmount + ", dueDate=" + dueDate
				+ ", status=" + status + "]";
	}


	
	
	

	

	
	
}
