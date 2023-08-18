package com.example.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name ="building")
@NoArgsConstructor
@Data
public class Building {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String name;
	private String street;
	
	
	public Building(String name, String street) {
		super();
		this.name = name;
		this.street = street;
	}
}
