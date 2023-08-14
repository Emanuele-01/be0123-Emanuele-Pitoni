package it.epicode.be.godfather.model;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Table (name= "ordine")
@Getter
@Setter
public class Ordine {

	@Id
	@GeneratedValue
	UUID id;
	
	
	private Integer numeroOrdine;
	private Tavolo tavolo;
	private final Map<MenuItem, Integer> ordinato = new HashMap<MenuItem, Integer>();
	private StatoOrdine stato = StatoOrdine.IN_CORSO;
	private Integer numeroCoperti = 1;
	private Double costoCoperto;

	public Integer addMenuItem(MenuItem item) {
		if (!ordinato.containsKey(item)) {
			ordinato.put(item, 1);
		} else {
			ordinato.put(item, ordinato.get(item) + 1);
		}

		return ordinato.get(item);
	}

	public Integer removeMenuItem(MenuItem item) {
		if (ordinato.containsKey(item)) {
			int currentNumber = ordinato.get(item);
			if (currentNumber == 1) {
				ordinato.remove(item);
				return 0;
			} else {
				ordinato.put(item, ordinato.get(item) - 1);
				return ordinato.get(item);
			}
		} else
			return 0;
	}

	public Double getTotale() {
		Double totale = 0d;
		for (MenuItem item : ordinato.keySet()) {
			totale += (item.getPrice() * ordinato.get(item));
		}
		totale += numeroCoperti * getCostoCoperto();
		return totale;
	}

}
