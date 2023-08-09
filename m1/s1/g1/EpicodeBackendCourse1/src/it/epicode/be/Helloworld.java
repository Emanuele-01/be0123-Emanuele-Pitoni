package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;

public class Helloworld {
	
	public static void main (String[] args)
			{
			// Stampa a console  la frase
//			System.out.println("This is my first Epicode Java Project!");
			//moltiply();
			//string();
			arrayEsercizio();
			//threestring();
			//perimetroRettangolo();
			//pariDispari();
			//areaTringolo();
			}
	
	public static void moltiply() {
		Scanner in = new Scanner(System.in);
		System.out.println("inserisci un numero");
		int num = in.nextInt();
		System.out.println("inserisci un altro numero");
		int num2 = in.nextInt();
		int mol = num * num2;
		System.out.println("questi numeri moltiplicati fanno: "+ mol);
		in.close();
	}
	
	public static void string() {
		Scanner str = new Scanner(System.in);
		System.out.println("inserisci una parola");
		String word1 = str.nextLine();
		System.out.println("inserisci un'altra parola");
		String word2 = str.nextLine();
		System.out.println(word1 + " " + word2);
		str.close();
	}
	
	public static void arrayEsercizio() {
		Scanner arr = new Scanner(System.in);
		String[] arrayName = {"giovanni","paolo","andrea","chiara","elena",""};
		System.out.println("inserisci un nome:");
		String name1= arr.nextLine();
		for(int i = arrayName.length-2; i >= 2; i--) {
	        arrayName[i+1] = arrayName[i];
	    };
	    arrayName[2] = name1;
	    
		System.out.println(Arrays.toString(arrayName));
		arr.close();
		}
	
	public static void threestring() {
		Scanner settens = new Scanner(System.in);
		System.out.println("inserisci la prima frase:");
		String oneSentence = settens.nextLine();	
		System.out.println("inserisci la seconda frase:");
		String twoSentence = settens.nextLine();	
		System.out.println("inserisci la terza frase:");
		String threeSentence = settens.nextLine();
		System.out.println(oneSentence + " " + twoSentence + " " + threeSentence);
		System.out.println(threeSentence + " " + twoSentence + " " + oneSentence);
		
		settens.close();
		}
	
	public static void perimetroRettangolo() {
		Scanner rettangolo = new Scanner(System.in);
		System.out.println("inserisci l'altezza (ricorda di mettere la virgola e non il punto)");
		double Lato1 = rettangolo.nextDouble();
		System.out.println("inserisci la base (ricorda di mettere la virgola e non il punto)");
		double Lato2 = rettangolo.nextDouble();
		double perimetro = Lato1 + Lato2 * 2;
		System.out.println(perimetro);
		
		rettangolo.close();
	}
	
	public static void pariDispari() {
		Scanner num = new Scanner(System.in);
		System.out.println("inserisci un numero intero e l'algoritmo ti restituirà '0' se il numero è pari e '1' se il numero è dispari");
		int number = num.nextInt();
		if(number % 2 == 0) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
		
		num.close();
	}
	
	public static void areaTringolo() {
		Scanner tri = new Scanner(System.in);
		System.out.println("inserisci uno dei tre lati del tringolo");
		double Lato1 = tri.nextDouble();
		System.out.println("inserisci uno dei tre lati del tringolo");
		double Lato2 = tri.nextDouble();
		System.out.println("inserisci uno dei tre lati del tringolo");
		double Lato3 = tri.nextDouble();
		double Area = Math.sqrt(Lato1 + Lato2 + Lato3);
		System.out.println(Area);
		
		tri.close();
	}
	
	
}