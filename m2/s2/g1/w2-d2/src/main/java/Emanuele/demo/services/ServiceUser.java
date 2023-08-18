package Emanuele.demo.services;

import org.springframework.stereotype.Service;

import Emanuele.demo.entities.User;

@Service
public class ServiceUser {
	
	public User create(User u) {
		
		User newUser = new User();
		
		newUser.setNome(u.getNome());
		newUser.setUsername(u.getUsername());
		newUser.setEmail(u.getEmail());
		newUser.setPassword(u.getPassword());
		
		return newUser;
	};
	
}
