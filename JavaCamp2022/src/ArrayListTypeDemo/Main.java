package ArrayListTypeDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// Java'da somut yapýlarý çalýþýrýz. Bu nedenle tip güvenli çalýþmalar yaparýz.Yani integer sa sadece integer veriler olmalý
		// Generic yapýlar kullanýlarak arrayList tip güvenli hale getirilebilir
		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("Ýzmir");
		sehirler.add("Ankara");
		sehirler.add("Ýstanbul");
		
		sehirler.remove("Ýstanbul");  // listeden belirli bir ögeyi siler
		Collections.sort(sehirler);  // Sýralama Collections class'ý ile yapýlýr
		for (String sehir: sehirler) {
			System.out.println(sehir);
			
		}
	}
}
