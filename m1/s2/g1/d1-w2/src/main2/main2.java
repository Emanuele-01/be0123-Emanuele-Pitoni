package main2;


import java.util.Scanner;
public class main2 {

	public static void main(String[] args) {
		consumi();

	}
	
	public static void consumi() {
		double benzina;
		double km;
		
		Scanner cons = new Scanner (System.in);
		
		try {
			System.out.println("inserisci il consumo in litri di benzina dell'autovettura.");
			benzina = cons.nextDouble();
			if(benzina == 0) {
				System.out.println("non puoi inserire 0");
				System.out.println("inserisci i km percorsi con i litri di benzina scritti prima.");
				km = cons.nextDouble();
				if(km == 0) {
					System.out.println("non puoi inserire 0");
				};
			};
		}catch(Exception e) {
			System.out.println("errore generico");
		};
		
		
		cons.close();
	};
}
