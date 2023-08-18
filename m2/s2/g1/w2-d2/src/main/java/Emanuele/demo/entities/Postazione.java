package Emanuele.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Postazione {
	

	private Long id;
	
	private String codice;
	private String descrizione;
	private Integer numeroMassimoOccupanti;
	

	public Postazione(String codice, String descrizione, Integer numeroMassimoOccupanti) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.numeroMassimoOccupanti = numeroMassimoOccupanti;
	}
}
