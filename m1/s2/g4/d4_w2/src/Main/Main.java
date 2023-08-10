package Main;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static Logger logger = (Logger) LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		
		// prodotti  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		ArrayList<Product> prodotti = new ArrayList<Product>();
		
		Product prodotto1 = new Product(123456, "MacBook Pro", "Elettronica",1299.00);
		
		Product prodotto2 = new Product(789012, "Nike Air Max", "Abbigliamento", 150.00);
		
		Product prodotto3 = new Product(345678, "Samsung Galaxy S21", "Elettronica", 799.00);
		
		Product prodotto4 = new Product(901234, "Sony WH-1000XM4", "Elettronica", 349.00);
		
		Product prodotto5 = new Product(567890, "Canon EOS R5", "Fotografia", 3899.00);
		
		Product prodotto6 = new Product(234567, "Adidas Ultraboost", "Abbigliamento", 180.00);
		
		Product prodotto7 = new Product(890123, "Apple Watch Series 6", "Elettronica", 399.00);
		
		Product prodotto8 = new Product(456789, "Google Pixel 5", "Elettronica", 699.00);
		
		Product prodotto9 = new Product(246810 , "Sapiens: A Brief History of Humankind", "Books", 144.99);
		
		Product prodotto10 = new Product(135791 , "Becoming", "Books", 188.99);
		
		prodotti.add(prodotto1);
		prodotti.add(prodotto2);
		prodotti.add(prodotto3);
		prodotti.add(prodotto4);
		prodotti.add(prodotto5);
		prodotti.add(prodotto6);
		prodotti.add(prodotto7);
		prodotti.add(prodotto8);
		prodotti.add(prodotto9);
		prodotti.add(prodotto10);
		
		List<String> ricercaBooks = prodotti.stream().filter(book -> book.getNameCategory().equals("Books")).filter(price -> price.getPrice() > 100.00).map(Product::getNameProduct).toList();
		System.out.println("i libri che costano più di 100 euro sono: " + ricercaBooks);
		
		
		
		// persone ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
		Customer person = new Customer(987654, "Alice", 3245);
		
		Customer person2 = new Customer(234567, "Bob", 4687);
		
		Customer person3 = new Customer(876543, "Charlie", 7098);
		
		Customer person4 = new Customer(345678, "Dave", 1567);
		
		Customer person5 = new Customer(765432, "Emily", 8312);
		
		
		
		//ordini  ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
				Order ordine1 = new Order(543210, "ok", "22.01.2010", "29.01.2010", prodotto1, person);
				Order ordine2 = new Order(987654, "error", "08.09.2012", "--", prodotto1, person);
				Order ordine3 = new Order(246810, "ok", "14.04.2016", "21.04.2016", prodotto1, person);
				Order ordine4 = new Order(135790, "ok", "03.11.2019", "10.11.2019", prodotto1, person);
				Order ordine5 = new Order(666999, "error", "28.02.2022", "--", prodotto1, person);
		
	}

}
