package it.epicode.be.godfather.model;

public class Ordine {
	PizzaBase pizza;
	Drink bevanda;
	StatoOrdine ordine;
	
	public Ordine(PizzaBase pizza, Drink bevanda, StatoOrdine Ordine) {
		this.pizza = pizza;
		this.bevanda = bevanda;
		this.ordine = Ordine;
	}
}
