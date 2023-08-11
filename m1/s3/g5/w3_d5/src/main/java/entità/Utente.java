package entità;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "utente")
@Getter
@Setter
public class Utente {
	@Id
	@GeneratedValue
	private UUID numeroTessera;
	protected String nome;
	protected String lastName;
	protected LocalDate compleanno;
	
	
	public Utente() {
		
	}
	
	public Utente(String nome, String lastName, LocalDate compleanno) {
		super();
		this.nome = nome;
		this.lastName = lastName;
		this.compleanno = compleanno;
	}
	
	@Override 
	public String toString() {
		return "utente: " + nome + ", " + lastName + ", numero tessera: " + numeroTessera;
	};
}
