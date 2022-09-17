package MukemmelSayilar;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// mükemmel sayý= mükemmel sayý kendinden baþka pozitif tüm tam bölenlerinin toplamý kendisine eþit olan sayýdýr
		// Örneðim 6. 6: 1/2/3 ' e bölünür. 3+2+1=6
		
		int number = 7;
		int sum = 0;
		for(int i=1;i<number;i++) {
			if(number % i == 0) {
				sum +=i;
			}
			
		}
		if (sum==number) {
			System.out.println("Bu sayý mükemmel sayýdýr");
		} else {
			System.out.println("Bu sayý mükemmel sayý deðildir");
		}
		

	}

}
