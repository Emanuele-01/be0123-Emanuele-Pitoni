package com.example.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.User;
import com.example.payload.UserPayload;
import com.example.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User create(UserPayload u) {
		User us = new User(u.getName(), u.getLastName(), u.getEmail(), u.getAge());
		return repository.save(us);
	};
	
	public User findById(UUID id) throws Exception{
		return repository.findById(id).orElseThrow(() -> new Exception("utente non trovato"));
	};
	
	public User findIdAndUpdate(UUID id, UserPayload user) throws Exception{
		User f = this.findById(id);
		
		f.setName(user.getName());
		f.setLastName(user.getLastName());
		f.setEmail(user.getEmail());
		f.setAge(user.getAge());
		
		return repository.save(f);
	};
	
	public void remove(UUID id) throws Exception{
		
		User f = this.findById(id);
		
		repository.delete(f);
	};
}
