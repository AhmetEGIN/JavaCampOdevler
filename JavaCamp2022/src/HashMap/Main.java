package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

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
		
		System.out.println(sozluk.values());
		String itemToSearch = "Kitap";
		System.out.println("-----");
		
		
		for (Entry<String, String> item : sozluk.entrySet()) {
			if (item.getValue().equals(itemToSearch)) {
				System.out.println("Key :" + item.getKey() + " / Value :" + item.getValue());
			}
		}
		
		// containsKey -- verilen key'in map in içerisinde olup olmadýðýný kontrol eder. Boolean döndürür
//		containsKey() ve containsValue() ile HashMap nesnesinde arama yapabiliriz. 
//		Ýki metodda kendisine parametre verilen deðeri ilgili nesne içerisinde bulabilirse true aksi halde false döner.
		// keySet sadece key'leri barýndýrýr
		// Java.util.Map.Entry  -- Map(HashMap) içerisindeki key-value çiftleri ile ilgili metotlara sahiptir.
		Set<Entry<String, String>> s = sozluk.entrySet();
		System.out.println(s);
		
	}
}
