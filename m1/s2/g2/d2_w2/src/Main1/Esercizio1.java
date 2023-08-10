package Main1;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Esercizio1 {

	public static void main(String[] args) {
		esercizio1();

	}
	
	
	public static void esercizio1() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("inserisci il numero di parole da mettere all'interno dell'Array.");
		int numWord = input.nextInt();
		
		
		Set<String> name = new HashSet<String>();
		Set<String> name2 = new HashSet<String>();
		
		for(int j = 0; j < numWord; j++) {
			System.out.println("inserisci parola numero " + (j+1) + ":");
			String word = input.next();
			
			if(!name.add(word)) {
				name2.add(word);
			};
			
		};
		
		
		for(String doppioni : name2) {
			System.out.println("le parole uguali sono: " + doppioni);
		};

		
		int numWordDiverse = name.size();
		System.out.println("il numero di parole diverse è: " + numWordDiverse);
		 
		System.out.println("e parole diverse tra di loro sono: ");
		 
		 for(String diversi : name) {
			 System.out.println("parole: " + diversi);
		 };
		
	};
	
	
}
