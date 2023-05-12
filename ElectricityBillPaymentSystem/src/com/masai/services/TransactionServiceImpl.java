package com.masai.services;

import java.util.ArrayList;
import java.util.List;

import com.masai.entities.Transaction;
import com.masai.exceptions.TransactionException;

public class TransactionServiceImpl implements TransactionService {

	@Override
	public List<Transaction> viewConsumerTransactions(String userName, List<Transaction> transactions)
			throws TransactionException {
		// TODO Auto-generated method stub
		List<Transaction> myTransactions = new ArrayList<>();

		boolean flag = false;
		for (Transaction tr : transactions) {
			if (tr.getUsername().equals(userName)) {

				myTransactions.add(tr);

				flag = true;
			}
		}
		if (!flag) {
			throw new TransactionException("you have not done any transaction yet");
		}

		return myTransactions;
	}

	@Override
	public List<Transaction> viewAllTransactions(List<Transaction> transactions) throws TransactionException {
		// TODO Auto-generated method stub
		if (transactions != null && transactions.size() > 0) {
			return transactions;
		} else {
			throw new TransactionException("no transactions have done yet");
		}
	}

}
