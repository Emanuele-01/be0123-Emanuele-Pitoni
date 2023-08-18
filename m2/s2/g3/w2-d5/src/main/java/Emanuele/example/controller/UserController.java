package Emanuele.example.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

import Emanuele.example.entities.User;
import Emanuele.example.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService us;
	
	@GetMapping("")
	public Page<User> getUser(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size, @RequestParam(defaultValue = "id") String Sorted){
		return us.find(page, size, Sorted);
	};
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public User createUser(@RequestBody User u) {
		return us.create(u);
	};
	
	@GetMapping("/{:Id}")
	public User getUser(@PathVariable UUID id) throws Exception{
		return us.findId(id);
	}
	
	@PutMapping("/{:id}")
	public User putUser(@PathVariable UUID id, @RequestBody User u) throws Exception{
		return us.findAndUpdate(id, u);
	};
	
	@DeleteMapping("/{:id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeUser(@PathVariable UUID id) throws Exception{
		us.findAndDelete(id);
	}
}
