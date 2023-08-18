package com.example.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="user")
@Data
public class User {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String name;
	private String lastName;
	private String Email;
	private int age;
	
	
	
	public User(String name, String lastName, String email, int age) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.Email = email;
		this.age = age;
	}
}
