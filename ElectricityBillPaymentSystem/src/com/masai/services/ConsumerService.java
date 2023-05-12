package com.masai.services;

import java.util.List;
import java.util.Map;

import com.masai.entities.Bill;
import com.masai.entities.Consumer;
import com.masai.entities.Transaction;
import com.masai.exceptions.BillException;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;

public interface ConsumerService {
	public boolean login(String userName, String password, Map<String, Consumer> consumers) throws InvalidDetailsException;

	public void signUp(Consumer co, Map<String, Consumer> consumers) throws DuplicateDataException;

	public void payBill(String userName, int amount, Map<String, Bill> bills, Map<String, Consumer> consumers,
			List<Transaction> transactions) throws InvalidDetailsException, BillException;

	public boolean addMoneyToWallet(int amount, String userName, Map<String, Consumer> consumers);

	public int viewWalletBalance(String userName, Map<String, Consumer> consumers);

	public Consumer viewConsumerDetails(String userName, Map<String, Consumer> consumers);

	public List<Consumer> viewAllConsumers(Map<String, Consumer> consumers) throws BillException;

}
