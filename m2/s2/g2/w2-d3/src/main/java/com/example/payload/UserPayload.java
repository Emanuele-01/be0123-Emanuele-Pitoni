package com.example.payload;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserPayload {
	
	@NotNull(message = "inserisci un nome valido")
	@Size(min=3 , max=15)
	String name;
	
	@NotNull(message = "inserisci un cognome valido")
	@Size(min=4, max=15)
	String lastName;
	
	@NotNull(message = "inserisci un indirizzo email valido")
	@Email
	String email;
	
	@NotNull(message = "inserisci un'etá valida")
	@Size(min=1, max=3)
	int age;
}
