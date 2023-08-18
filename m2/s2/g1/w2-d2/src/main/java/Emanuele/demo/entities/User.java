package Emanuele.demo.entities;

import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@ToString
public class User {



	private Long id;
	private String username;
	private String nome;
	private String email;
	private Boolean active;
	
	private String password;
	
	private Set<Role> roles = new HashSet<>();	
	
	public User(String username, String nome, String email, String password, Set<Role> roles) {
		super();
		this.username = username;
		this.nome = nome;
		this.email = email;
		this.active = true;
		this.password = password;
		this.roles = roles;
	}

}
