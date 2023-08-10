package main1;

public class Main1 {

	public static void main(String[] args) {
		
		Rettangolo Ret1 = new Rettangolo(10, 5);
		
		System.out.println(Ret1.toString());
		System.out.println(Ret1.area());
		System.out.println(Ret1.perimetro());
		System.out.println(Ret1.perimetro()+ Ret1.area());

	}
	
}
