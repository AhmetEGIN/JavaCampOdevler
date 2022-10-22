package arrayListDemo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,3};
		System.out.println(sayilar[0]);
		System.out.println("-------");
		// array tanýmladýðýmýz zaman array'in bir sýnýrý oluyor. Örneðin yukarýdaki array'in sýnýrý 3'tür.
		
		// ArrayList kullanabilmek için java.util paketini import etmemiz gerekir.
		ArrayList sayilar2 = new ArrayList();
		
		sayilar2.add(10);
		sayilar2.add(1000);
		sayilar2.add("Ankara");
		// arraylist'te tür belirtmezsek int, string ... deðerleri alabilir.
		System.out.println(sayilar2.size()); // arraylist'teki eleman sayýsý
		System.out.println(sayilar2.get(2));  // belirtilen indexteki deðeri verir
		sayilar2.set(0, 100); // arraylist'te bir deðeri deðiþtirmek için set kullanýlýr.
		// LÝste boyutndan daha büyük bir index verirsek program hata verir
		System.out.println(sayilar2.get(0));
		System.out.println("-------");
		sayilar2.remove(0); // listeden veri silmek için indexini veririz.
		System.out.println(sayilar2.get(0));   // veriyi sildiðimiz zaman bu indexin önündeki deðerler bir geriye gelir.
		//sayilar2.clear();  // tüm elemanlarý siler
		System.out.println(sayilar2.size());
		System.out.println("--------");
		for(Object object : sayilar2) {
			System.out.println(object);
		}
		

		
		
		
		
	}
}
