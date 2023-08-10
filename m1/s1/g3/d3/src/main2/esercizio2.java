package main2;

import java.util.Scanner;

public class esercizio2 {

	public static void main(String[] args) {
		
		number();

	}
	
	public static void number() {
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("inserisci un numero intero, compreso tra 0 e 3.");
		
		int numero = num.nextInt();
		
		switch (numero) {
		case 0 : 
			System.out.println("zero");
			break;
		case 1 : 
			System.out.println("uno");
			break;
		case 2 : 
			System.out.println("due");
			break;
		case 3 : 
			System.out.println("tre");
			break;
		default:
			System.out.println("errore");
		};
		
		num.close();
	};

}
