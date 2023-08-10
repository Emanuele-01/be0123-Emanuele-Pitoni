package main1;

import java.util.Scanner;

public class esercizio1 {

	public static void main(String[] args) {
		
		//parola();
		years();

	}
	
	
	static String word;
	
	public static void parola() {
		
		Scanner Word1 = new Scanner(System.in);
		
		System.out.println("scrivi una parola: ");
		word = Word1.nextLine();
		
		
		if(word.length() % 2 == 0) {
			System.out.println(true);
		}else{
			System.out.println(false);
		};
		Word1.close();
	};
	
	
	static int anno;
	
	public static void years() {
		
		Scanner year = new Scanner(System.in);
		
		System.out.println("scrivi un anno: ");
		System.out.println("ritornerà true se bisestile o false se l'anno non è bisestile.");
		
		anno = year.nextInt();
		
		if(anno % 400 == 0 || (anno % 4 == 0 && !(anno % 100 == 0))) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		year.close();
		
	};
}
