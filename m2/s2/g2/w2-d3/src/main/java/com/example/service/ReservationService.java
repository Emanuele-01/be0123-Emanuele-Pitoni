package com.example.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Reservations;
import com.example.repositories.ReservationRepository;

@Service
public class ReservationService {
	@Autowired
	private ReservationRepository repository;
	
	public Reservations create(Reservations reservation) {
		return repository.save(reservation);
	};
	
	public Reservations findById(UUID id) throws Exception{
		return repository.findById(id).orElseThrow(() -> new Exception("prenotazione non trovato"));
	};
	
	public Reservations findIdAndUpdate(UUID id, Reservations reservation) throws Exception{
		Reservations f = this.findById(id);
		
		f.setId(id);
		f.setDataPrenotazione(reservation.getDataPrenotazione());;
		f.setCity(reservation.getCity());
		f.setFineDataPrenotazione(reservation.getFineDataPrenotazione());
		f.setLocation(reservation.getLocation());
		f.setUser(reservation.getUser());
		
		return repository.save(f);
	};
	
	public void remove(UUID id) throws Exception{
		
		Reservations f = this.findById(id);
		
		repository.delete(f);
	};
}
