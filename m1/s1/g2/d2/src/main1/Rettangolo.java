package main1;

public class Rettangolo {
	
	int base;
	int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public int area() {
		return base * altezza;
	}
	
	public int perimetro() {
		return (base + altezza) * 2;
	}
	
@Override
	
	public String toString() {
		return this.base + " " + this.altezza;
	}
};
