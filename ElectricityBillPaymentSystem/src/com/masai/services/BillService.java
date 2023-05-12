package com.masai.services;

import java.util.Map;

import com.masai.entities.Bill;
import com.masai.exceptions.BillException;

public interface BillService {

	public String addBill(Bill bill, Map<String, Bill> bills);

	public void viewAllBills(Map<String, Bill> bills) throws BillException;

	public void deleteBill(String userName, Map<String, Bill> bills) throws BillException;

	public String updateBill(String userName, Bill update, Map<String, Bill> bills) throws BillException;

	public Bill viewBill(String userName, Map<String, Bill> bills) throws BillException;
}
