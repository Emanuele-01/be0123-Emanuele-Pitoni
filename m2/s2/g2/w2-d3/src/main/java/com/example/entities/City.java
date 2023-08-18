package com.example.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "city")
@NoArgsConstructor
@Data
public class City {

	@Id
	@GeneratedValue
	private UUID id;
	
	
	private String name;
	
	
	public City(String name) {
		super();
		this.name = name;
	}
}
