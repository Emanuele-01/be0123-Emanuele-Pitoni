package main3;

public class Carrello {
	
	private Cliente cliente;
	private Prodotto[] prodotto;
	private double totaleCosto;

	
	public Cliente getCliente() {
		return cliente;
	};
	
	public Prodotto[] getProdotti() {
		return prodotto;
	};
	
	public double getTotaleCosto() {
		return totaleCosto;
	};
	
	// ------------------------------------------------------------------
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	};
	
	public void setProdotti(Prodotto[] prodotti) {
		this.prodotto = prodotti;
	};

	public void setTotaleCosto(double totaleCosto) {
		this.totaleCosto = totaleCosto;
	};
	
}
