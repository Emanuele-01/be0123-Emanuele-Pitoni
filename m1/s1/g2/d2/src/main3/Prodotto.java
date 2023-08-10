package main3;

public class Prodotto {
	
	private String description;
	private static int numeroPezziInMagazzino;
	private int code;
	private double price;
	
	public Prodotto(String description, int magazzino, int code, double price) {
		
		this.description = description;
		this.code = code;
		this.price = price;
	};
	
	// -------------------------------------------------------------------
	
	public void setDescription(String description) {
		this.description = description;
	};

	
	public void setCode(int code) {
		this.code = code;
	};
	
	public void setPrice(double price) {
		this.price = price;
	};
	
	public static void setNumeroPezziInMagazzino(int numeroPezziInMagazzino) {
		Prodotto.numeroPezziInMagazzino = numeroPezziInMagazzino;
	}
	// -------------------------------------------------------------------
	
	public String getDescription() {
		return description;
	};
	
	public int getCode() {
		return code;
	};
	
	public double getPrice() {
		return price;
	};
	
	public static int getNumeroPezziInMagazzino() {
		return numeroPezziInMagazzino;
	}

}
