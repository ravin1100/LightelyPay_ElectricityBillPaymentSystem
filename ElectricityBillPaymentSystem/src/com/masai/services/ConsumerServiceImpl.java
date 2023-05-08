package com.masai.services;

import java.util.Map;

import com.masai.entities.Consumer;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;

public class ConsumerServiceImpl implements ConsumerService {
	@Override
	public void signUp(Consumer co, Map<String, Consumer> consumers) throws DuplicateDataException{
		
	}

	@Override
	public boolean login(String email, String password, Map<String, Consumer> consumers)
			throws InvalidDetailsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean payBill(int id, double amount) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
