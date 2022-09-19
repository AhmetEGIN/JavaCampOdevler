package KullanýcýdanInputAlma;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		System.out.println("Bir sayý giriniz: ");
		int a = scan.nextInt();   // integer deðeri için kullanýlýr
		System.out.println("Deðiþkenin deðeri: " + a);
		
		System.out.println("Bir sayý giriniz:");  // double deðer için kullanýlýr
		double b = scan.nextDouble();    // bazý dillerde bu yazýnýn yazým þekli farklý. 3.14 veya 3,14 þeklinde yazýlabilir
		// bu durumda standartlarý scan.useLocale(Locale.US) ile belirtiriz
		System.out.println(b);
		
		System.out.println("Bir metin giriniz");
		String mesaj = scan.nextLine();
		System.out.println(mesaj);
		
	}

}
