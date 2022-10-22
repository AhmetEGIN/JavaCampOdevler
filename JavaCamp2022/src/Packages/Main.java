package Packages;
import java.util.Scanner;

import Packages.matematik.DortIslem;

public class Main {

	public static void main(String[] args) {
		// package programlamada birbiriyle ilgili þeyleri gruplandýrmamýza yarar
		// Kodlarý okuduðumuz zaman mesela bir class'ý aradýðýmýz zaman o class'ý nerede arayacaðýmýzý biliriz.
		// Bir paketi baþka bir projede de kullanabiliriz. 
		// Bu sebeplerden dolayý paket yapýsý fazlaca kullanýlýr.
		// Java'nýn içerisinde tanýmlanmýþ paketler vardýr. Bunlara built-in denir.
		// bir paketi baþka bir paketin içerisinde kullanmak istersek onu import etmemiz gerekir. Ýmport paketler arasý iletiþim saðlar.
		// Sýklýkla kullanýlan paketler: Veri eriþim katmaný, iþlem katmaný, arayüz katmaný, core katmaný
		// bir paketteki her class'ý kullanmak istiyorsak paket adýnýn yanýna * koyulur. Örneðin
		// import Packages.matematik.*;
		Scanner scanner = new Scanner(System.in); // Scanner console ekranýnda data okumaya yarar.

		//System.out.println("Adýnýz");
		//String name = scanner.nextLine();
		//System.out.println("Merhaba "+ name);
		
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.Topla(1, 3));
		
		
	}
}
