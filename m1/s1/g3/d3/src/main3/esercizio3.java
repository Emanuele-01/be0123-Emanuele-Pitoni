package main3;

import java.util.Scanner;

public class esercizio3 {

	public static void main(String[] args) {
		
		word();

	}
	
	public static void word() {
		Scanner w1= new Scanner(System.in);
		
		System.out.println("inserisci una parola e verrà divisa in lettere");
		System.out.println("scrivi :q per uscire dal programma");
		
		String Parola1 = w1.nextLine();
		
		while (!Parola1.contains(":q")) {
			
//			System.out.println(Arrays.toString(Parola1.split("")));
			
			String[] lettere = Parola1.split("");
			System.out.println(String.join(",", lettere));
			break;
		}
		w1.close();
	}
}
