package it.epicode.be.godfather.model;

public class Tavolo {
	int identityNum;
	int copertoMax;
	Disponibilità disp;
	
	public Tavolo(int identityNum, int copertoMax, Disponibilità disp) {
		this.identityNum = identityNum;
		this.copertoMax = copertoMax;
		this.disp = disp;
	};
	
	@Override
	public String toString() {
		return "Tavolo n° " + identityNum + " numero massimo tavolo: " + copertoMax + " disponibilità: " + disp;
	};
}
