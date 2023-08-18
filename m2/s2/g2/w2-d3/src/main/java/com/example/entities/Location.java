package com.example.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="location")
@Data
public class Location {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String code;
	private String description;
	private int maxNumPeople;
	
	@Enumerated(EnumType.STRING)
	private LocationType locationType;
	
	public Location(String code, String description, int maxNumPeople, LocationType locationType) {
		super();
		this.code = code;
		this.description = description;
		this.maxNumPeople = maxNumPeople;
		this.locationType = locationType;
	}
}
