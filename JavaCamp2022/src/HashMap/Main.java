package HashMap;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// hashMap sözlüklere benzer. C#'taki Dictionary gibi
		HashMap<String, String> sozluk = new HashMap<String, String>();
		sozluk.put("book", "Kitap"); // HashMap' e eleman eklemep için put kullanýlýr
		sozluk.put("Table", "Masa");
		sozluk.put("name", "isim");
		sozluk.put("Computer", "Bilgisayar");
		System.out.println(sozluk);
		System.out.println(sozluk.size());   // eleman sayýsýný verir
		System.out.println(sozluk.get("Table"));   // Veri çekmek için key deðerini girebiliriz.
		sozluk.remove("Table");  // silmek için kullanýlýr
		System.out.println(sozluk.get("Table"));   // referansý olmadýðý iin null döner
		// sozluk.clear();   hashMap'teki bütün elemanlarý siler
		
		System.out.println(sozluk.keySet());  // sozlukteki key leri verir.	
		for(String item : sozluk.keySet()) {
			System.out.println("Eleman: " + item + " deðer: "+ sozluk.get(item));
			
		}
		
		
		
	}
}
