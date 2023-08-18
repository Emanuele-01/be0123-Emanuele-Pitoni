package com.example.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.entities.User;
import com.example.payload.UserPayload;
import com.example.service.UserService;

@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	UserService uService;

	@GetMapping(path = "")
	@ResponseStatus(HttpStatus.OK)
	public User user (@PathVariable UUID id) throws Exception {
		return uService.findById(id);
	};
	
	// ----------------------------------------------------------------------------------------
	
	@PutMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public User userUpdate(@PathVariable UUID id, @RequestBody UserPayload up) throws Exception{
		return uService.findIdAndUpdate(id, up);
	};
	
	// ---------------------------------------------------------------------------------------
	
	@DeleteMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable UUID id) throws Exception{
		uService.remove(id);
	};
}
