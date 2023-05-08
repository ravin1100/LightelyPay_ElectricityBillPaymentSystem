package com.masai.services;

import java.util.Map;

import javax.sound.midi.InvalidMidiDataException;

import com.masai.entities.Consumer;
import com.masai.exceptions.DuplicateDataException;
import com.masai.exceptions.InvalidDetailsException;

public interface ConsumerService {
	public boolean login(String email, String password, Map<String, Consumer> consumers) throws InvalidDetailsException;
	public void signUp(Consumer co, Map<String, Consumer> consumers) throws DuplicateDataException;
	public boolean payBill(int id,double amount,)
}
