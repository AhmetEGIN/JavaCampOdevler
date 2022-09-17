package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		// stringler bir karakter dizisidir. Yani char array idir.
		System.out.println(mesaj);

		System.out.println("Eleman sayýsý: " + mesaj.length()); // karakter sayýsýný belirler
		System.out.println("5. Eleman: " + mesaj.charAt(4)); // belirli bir elemaný bulmak için charAt() kullanýlýr
		System.out.println(mesaj.concat(" Yaþasýn")); // String ifadeye ekleme yapmak için concat() kullanýlýr.
		System.out.println(mesaj.startsWith("B"));  // Eðer B ile baþlýyorsa true döndürür, deðilse false döndürür
		System.out.println(mesaj.endsWith("j"));
		char[] characters = new char[10];
		mesaj.getChars(0, 5, characters, 2);   //  getChars(0(hangi karakterden baþlayacapý), 5(kaçýncý karaktere kadar alacaðý, 5 i dahil etmez), 
		//characters(bu char array ini nereye aktaracaðý), 2(aktarýlacak array de kaçýncý karakterden baþlayacaðý))
		System.out.println(characters);
		System.out.println(mesaj.indexOf("av")); // belirttiðiniz elemanýn ilk olarak kaçýncý karakterde olduðunu belirtir
												// bu aramada string char int ... kullanýlabilir
		System.out.println(mesaj.lastIndexOf('e'));  // aramaya saðdan baþlar sýrayý yine soldan belirtir
		System.out.println(mesaj.lastIndexOf('a'));
		
		System.out.println("------------------------");
		
		String yeniMesaj = mesaj.replace(' ', '-');  // mesajý eðer farklý bir string olarak tutmak istediðimizde yeni bir deðer tanýmlarýz
		System.out.println(mesaj.replace(' ', '-'));  // replace = deðiþtirme. Bu örnekte boþluk yerine - iþareti koyar
		// substring = bir metnin içerisinden parça almak amacý ile kullanýlýr
		System.out.println(mesaj.substring(2));  // 2. indexten sonrasýný alýr
		System.out.println(mesaj.substring(2, 4));  // 2. indexten baþlar 4. indexe kadar gider. 4. Index dahil deðil
		// split fonksiyonu string ifadeyi belli bir karakter veya karakter dizisini dikkate alarak parçalamaya yarar
		// split bir dizi göderir
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());  // küçük harfe çevirir
		System.out.println(mesaj.toUpperCase());  // BÜYÜK HARFE ÇEVÝRÝR
		System.out.println(mesaj.trim());  // trim metodu stringin baþýndaki ve sonundaki boþluklarý yok eder
		
		
	}

}
