package com.example.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Location;
import com.example.repositories.LocationRepository;


@Service
public class LocationService {
	
	@Autowired
	private LocationRepository repository;
	
	public Location create(Location location) {
		return repository.save(location);
	};
	
	public Location findById(UUID id) throws Exception{
		return repository.findById(id).orElseThrow(() -> new Exception("Location non trovato"));
	};
	
	public Location findIdAndUpdate(UUID id, Location location) throws Exception{
		Location f = this.findById(id);
		
		f.setId(id);
		f.setCode(location.getCode());
		f.setDescription(location.getDescription());
		f.setLocationType(location.getLocationType());
		f.setMaxNumPeople(location.getMaxNumPeople());
		
		return repository.save(f);
	};
	
	public void remove(UUID id) throws Exception{
		
		Location f = this.findById(id);
		
		repository.delete(f);
	};
}
