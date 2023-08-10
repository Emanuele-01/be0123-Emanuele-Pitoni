package main4;

import java.util.Scanner;

public class esercizio4 {

	public static void main(String[] args) {
		
		timer();

	}

	public static void timer() {
		
		Scanner time = new Scanner(System.in);
		
		System.out.println("scrivi un numero intero:");
		
		int num = time.nextInt();
		
		for(int i = num; i >= 0; i--) {
			
			System.out.print(i + " ");
		}
		
		time.close();
	};
}
