package com.masai.services;

import java.util.List;

import com.masai.entities.Transaction;
import com.masai.exceptions.TransactionException;

public interface TransactionService {
	public List<Transaction> viewConsumerTransactions(String userName, List<Transaction> transactions)
			throws TransactionException;

	public List<Transaction> viewAllTransactions(List<Transaction> transactions) throws TransactionException;
}
