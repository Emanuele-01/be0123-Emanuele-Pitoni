package main3;

import java.time.LocalDate;

public class Cliente {
	
	private String name;
	private String lastname;
	private String email;
	private int codiceCliente;
	private LocalDate iscrizione;

	public Cliente(String name, String lastname, String email, int codiceCliente) {

		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.codiceCliente = codiceCliente;
		this.iscrizione = LocalDate.now();
	}
	
	// ---------------------------------------------------------
	
	public void setName(String name) {
		this.name = name;
	};
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	};
	
	public void setEmail(String email) {
		this.email = email;
	};
	
	public void setCodiceCliente(int codiceCliente) {
		this.codiceCliente = codiceCliente;
	};

	// ---------------------------------------------------------
	
	public String getName() {
		return name;
	};
	
	public String getLastname() {
		return lastname;
	};
	
	public String getEmail() {
		return email;
	};
	
	public int getCodiceClienete() {
		return codiceCliente;
	};
	
	public LocalDate iscrizione() {
		return iscrizione;
	};
}
