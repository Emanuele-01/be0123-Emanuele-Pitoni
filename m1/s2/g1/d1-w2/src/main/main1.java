package main;

import java.util.Arrays;
import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		
		random();

	}
	
	public static void random() {
		
		int[] arrayNum = new int[5];
		
		for(int j = 0; j <= arrayNum.length -1; j++) {
			
			int randomNum = (int) Math.floor(Math.random()*10);
			arrayNum[j] = randomNum;
		};
		
		System.out.println(Arrays.toString(arrayNum));
		
		Scanner inNum = new Scanner (System.in);
		
		
		
		
		
		int arrUserNum = 1;
		
		do {
			System.out.println("inserisci ora un numero da 1 a 10");
			arrUserNum = inNum.nextInt();
			if(arrUserNum != 0) {
				int userNum;
				try {
					System.out.println("inserisci un numero da 0 a 4.");
					userNum = inNum.nextInt();
					arrayNum[userNum] = arrUserNum;
					System.out.println("il tuo numero è impostato.");
					
					System.out.println(Arrays.toString(arrayNum));
					
				}catch(Exception e){
					System.out.println("errore nel numero");
				};
			}else {
				System.out.println("inserisci un numero da 1 a 10.");
				
			};
		}while(arrUserNum != 0);
		
		inNum.close();
		
		
	};
}
