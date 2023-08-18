package Emanuele.example.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String name;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	
	public User(String name, String lastName,String userName, String email, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}
}
