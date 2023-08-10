package Main2;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class esercizio2 {

	public static void main(String[] args) {
		int number = 10;
		List<Integer> List1 = Random(number); 
		System.out.println("la lista generata è formata cosi: " + List1);
		
		List<Integer> List2 = invert(List1); 
		System.out.println("la lista invertita dal più piccolo al più grande: " + List2);
	}
	
	public static List<Integer> Random(int number) {
		List<Integer> ListOne = new ArrayList<Integer>();
		Random numRand = new Random();
		for(int j = 0 ; j < number; j++) {
			ListOne.add(numRand.nextInt(101));
		};
		Collections.sort(ListOne);
		return ListOne;
		
	};

	public static List<Integer> invert(List<Integer> list){
		List<Integer> inverterList = new ArrayList<Integer>(list);
		Collections.reverse(inverterList);
		list.addAll(inverterList);
		return list;
	};
}
