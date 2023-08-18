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

import com.example.entities.Reservations;
import com.example.service.ReservationService;

@RequestMapping("/reservation")
public class ReservationController {

	ReservationService rService;
	
	@GetMapping(path = "")
	@ResponseStatus(HttpStatus.OK)
	public Reservations user (@PathVariable UUID id) throws Exception {
		return rService.findById(id);
	};
	
	// ----------------------------------------------------------------------------------------
	
	@PutMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Reservations userUpdate(@PathVariable UUID id, @RequestBody Reservations up) throws Exception{
		return rService.findIdAndUpdate(id, up);
	};
	
	// ---------------------------------------------------------------------------------------
	
	@DeleteMapping(path = "/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteUser(@PathVariable UUID id) throws Exception{
		rService.remove(id);
	};
}
