package com.example.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.entities.Location;
import com.example.service.LocationService;



@RequestMapping(path = "/location")
public class LocationController {
	
	LocationService lService;
	
	@GetMapping(path = "")
	@ResponseStatus(HttpStatus.OK)
	public Location user (@PathVariable UUID id) throws Exception {
		return lService.findById(id);
	};
	
	// ----------------------------------------------------------------------------------------
	
	@PutMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Location userUpdate(@PathVariable UUID id, @RequestBody Location up) throws Exception{
		return lService.findIdAndUpdate(id, up);
	};
	
	// ---------------------------------------------------------------------------------------
	
	@DeleteMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable UUID id) throws Exception{
		lService.remove(id);
	};

}
