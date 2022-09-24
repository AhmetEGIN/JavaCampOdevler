package LoopDemo;

public class Main {

	public static void main(String[] args) {
		// For
		for(int i=0;i<=10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngü bitti");
		
		// While
		System.out.println("While döngüsü");
		int i =0;
		while (i<=10) {
			System.out.println(i);
			i ++;
		}
		System.out.println("While döngüsü bitti");
		
		System.out.println("Do-While döngüsü");
		// do while
		// do- while döngüsünün while döngüsünden farký: do-while döngüsünde þart saðlanmasa bile 1 kere çelýþýr
		// ancak while döngüsünde þartýn saðlanmasý gerekir
		int j = 100;
		do {
			System.out.println(j);
			j +=2;
		}
		while(j<=10);
		
		
		
		
	}

}
