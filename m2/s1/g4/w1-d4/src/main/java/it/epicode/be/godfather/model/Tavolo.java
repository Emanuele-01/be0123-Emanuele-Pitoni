package it.epicode.be.godfather.model;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Table(name="tavolo")
@Getter
@Setter
public class Tavolo {
	
	@Id
	@GeneratedValue
	UUID id;
	
	private final Integer numero;
	private final Integer numeroMassimoCoperti;
	private Boolean occupato = false;

	
	public Tavolo(Integer numero, Integer numeroMassimoCoperti, Boolean occupato) {
		this.numero = numero;
		this.numeroMassimoCoperti = numeroMassimoCoperti;
		this.occupato = occupato;
	}
	public Boolean getOccupato() {
		return occupato;
	}
	public void setOccupato(Boolean occupato) {
		this.occupato = occupato;
	}
	public Integer getNumero() {
		return numero;
	}
	public Integer getNumeroMassimoCoperti() {
		return numeroMassimoCoperti;
	}
	
}
