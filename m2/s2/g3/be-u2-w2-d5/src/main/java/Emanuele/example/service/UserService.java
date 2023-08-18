package Emanuele.example.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Pageable;
import Emanuele.example.entities.User;
import Emanuele.example.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public User create(User u) {
		//User newU = new User(u.getName(), u.getLastName(), u.getEmail(), u.getUserName(), u.getPassword());
		return repository.save(u);
	}; 
	
	
	public Page<User> find(int page, int size, String sortedBy){
		if (size < 0) size = 10;
		
		if (size > 50) size = 50;
		Pageable pageable = PageRequest.of(page, size, Sort.by(sortedBy));
		
		return repository.findAll(pageable);
	}
	
	
//	public User findEmail(String email) throws Exception{
//		return repository.findEmail(email).orElseThrow(() -> new Exception("utente no  trovato"));
//	};
	
	public User findId (UUID id) throws Exception{
		return repository.findById(id).orElseThrow(() -> new Exception("utente non trovato"));
	};
	
	public User findAndUpdate(UUID id, User user) throws Exception{
		User f = this.findId(id);
		
		f.setId(id);
		f.setName(user.getName());
		f.setLastName(user.getLastName());
		f.setUserName(user.getUserName());
		f.setPassword(user.getPassword());
		
		return repository.save(f);
	}
	
	public void findAndDelete(UUID id) throws Exception {
		User f = this.findId(id);
		repository.delete(f);
	}
}
