package entità;

import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "prestito")
@Getter
@Setter
public class Prestito {
	@Id 
	@GeneratedValue 
	private UUID id;
	@ManyToOne
	protected Utente prestitoUtente;
	@ManyToOne
	protected carta elementoPrestato;
	protected LocalDate inizioPrestito;
	protected LocalDate finePrestito;
	protected LocalDate restituzionePrestito;
	
	public Prestito() {
		
	}
	
	public Prestito(Utente prestitoUtente, carta elementoPrestato ,LocalDate inizioPrestito, LocalDate finePrestito, LocalDate restituzionePrestito) {
		super();
		this.prestitoUtente = prestitoUtente;
		this.elementoPrestato = elementoPrestato;
		this.inizioPrestito = inizioPrestito;
		this.finePrestito = finePrestito.plusDays(30);
		this.restituzionePrestito = restituzionePrestito;
	}
	
	@Override
	public String toString() {
		return"Utente del prestito: "+ prestitoUtente + "inizio prestito: " + inizioPrestito + " fine prestito: " + finePrestito + " data effettiva di restituzione: " + restituzionePrestito;
	};
}
