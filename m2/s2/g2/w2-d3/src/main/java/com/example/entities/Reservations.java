package com.example.entities;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Reservations")
@Data

public class Reservations {

	@Id
	@GeneratedValue
	private UUID id;
	
	private City city;
	private User user;
	private Location location;
	private Date dataPrenotazione;
	private Date fineDataPrenotazione;
	

	public Reservations(City city, User user, Location location, Date dataPrenotazione, Date fineDataPrenotazione) {
		super();
		this.city = city;
		this.user = user;
		this.location = location;
		this.dataPrenotazione = dataPrenotazione;
		this.dataPrenotazione = fineDataPrenotazione;
	}
}
