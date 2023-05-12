package com.masai.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.masai.entities.Bill;
import com.masai.entities.Consumer;
import com.masai.entities.Transaction;
import com.masai.exceptions.BillException;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;

public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public boolean login(String userName, String password, Map<String, Consumer> consumers)
			throws InvalidDetailsException {
		// TODO Auto-generated method stub
		if (consumers.containsKey(userName)) {

			if (consumers.get(userName).getPassword().equals(password)) {
				return true;
			} else {
				throw new InvalidDetailsException("Invalid Credentials");
			}

		} else {
			throw new InvalidDetailsException("you have not sign up yet, please signup");
		}
	}

//	@Override
//	public void signUp(Consumer co, Map<String, Consumer> consumers) throws DuplicateDataException {
//		// TODO Auto-generated method stub
//		if (consumers.containsKey(co.getUserName())) {
//			throw new DuplicateDataException("Customer already exists , please login");
//		} else {
//
//			consumers.put(co.getUserName(), co);
//		}
//
//	}
//	
//	@Override
//	public void signUp(Consumer co, Map<String, Consumer> consumers) throws DuplicateDataException {
//	    if (consumers == null) {
//	        consumers = new HashMap<>(); // Initialize consumers map if it is null
//	    }
//
//	    if (consumers.containsKey(co.getUserName())) {
//	        throw new DuplicateDataException("Customer already exists, please log in");
//	    } else {
//	        consumers.put(co.getUserName(), co);
//	    }
//	}
	@Override
	public void signUp(Consumer co, Map<String, Consumer> consumers) throws DuplicateDataException {
	    if (consumers == null) {
	    	consumers.put(co.getUserName(), co);
	    }

	    if (consumers.containsKey(co.getUserName())) {
	        throw new DuplicateDataException("Customer already exists, please log in");
	    } else {
	        consumers.put(co.getUserName(), co);
	    }
	}


	@Override
	public void payBill(String userName, int amount, Map<String, Bill> bills, Map<String, Consumer> consumers,
			List<Transaction> transactions) throws BillException, InvalidDetailsException {
		// TODO Auto-generated method stub
		if (bills.size() == 0)
			throw new BillException("No bill listed yet");
		if (bills.containsKey(userName)) {
			Bill bill = bills.get(userName);
			int billAmount = bill.getTotalBillAmount();
			Consumer con = consumers.get(userName);
			if (con.getWalletBalance() >= billAmount) {
				con.setWalletBalance(con.getWalletBalance() - billAmount);
				bill.setStatus("Paid");
				bills.put(userName, bill);
				Transaction tr = new Transaction(con.getUserName(), con.getEmail(), billAmount, LocalDate.now());

				transactions.add(tr);
			} else {
				throw new InvalidDetailsException("wallet balance is not sufficient");
			}
		} else {
			throw new InvalidDetailsException("Bill not available with userName: " + userName);
		}

	}

	@Override
	public boolean addMoneyToWallet(int amount, String userName, Map<String, Consumer> consumers) {
		// TODO Auto-generated method stub
		Consumer co = consumers.get(userName);

		co.setWalletBalance(co.getWalletBalance() + amount);

		consumers.put(userName, co);

		return true;

	}

	@Override
	public int viewWalletBalance(String userName, Map<String, Consumer> consumers) {
		// TODO Auto-generated method stub
		Consumer con = consumers.get(userName);

		return con.getWalletBalance();
	}

	@Override
	public Consumer viewConsumerDetails(String userName, Map<String, Consumer> consumers) {
		// TODO Auto-generated method stub
		if (consumers.containsKey(userName)) {

			return consumers.get(userName);

		}

		return null;

	}

	@Override
	public List<Consumer> viewAllConsumers(Map<String, Consumer> consumers) throws BillException {
		// TODO Auto-generated method stub
		List<Consumer> list = null;

		if (consumers != null && consumers.size() > 0) {
			Collection<Consumer> coll = consumers.values();
			list = new ArrayList<>(coll);
		} else {
			throw new BillException("Consumer list is empty");
		}

		return list;
	}

}
