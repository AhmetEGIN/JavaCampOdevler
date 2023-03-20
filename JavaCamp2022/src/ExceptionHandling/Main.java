package ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		String sehir = "Ankara";
		// int sayi = sehir;  bu kod compile olmaz. 
		// Bizim try-catch ile yönettiðimiz hatalar uygulama build olduktan sonra çalýþma anýnda belli deðerlerde sýkýntý çýkaran hatalardýr
		int[] sayilar = new int[] {1,2,3};
		// System.out.println(sayilar[3]);   ArrayIndexOutOfBoundsException
		
		try {  
			// try bloðunun içindeki kod çalýþýr
			// Catch ya da finally bloðunu da belirtmemiz gerekir
			System.out.println(sayilar[5]);
		}
		catch (Exception exception) {
			// eðer try bloðunda hata varsa catch bloðu çalýþýr
			System.out.println("hata oluþtu: " + exception.getMessage());
			System.out.println(exception);
		}
		finally {
			// finally bloðu en son çalýþacak bloktur. 
			// Try ya da catch 'in çalýþmasý farketmez. Finally bloðu her zaman çalýþýr
			System.out.println("Finally bloðu çalýþtý");
			// Örneðin veri tabanýna baðlandýktan sonra hata oluþtu. Hata oluþtuktan sonra bu blok yardýmýyla veri tabaný eriþimini kapatabiliriz
			// Ayný þekilde eðer dosya ile çalýþýyorsak finally bloðu ile o dosyayý kapatabiliriz.
		}
		
		try {  

			System.out.println(sayilar[5]);
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			//Hatanýn türüne göre kullanýcýyý belirli bir yere gönderebilmeliyiz.
			// Belirli bir hatayý handle etmek istiyorsak bu hatayý parametre olarak almalýyýz.
			// Birden fazla hatayý ayrý ayrý kontrol edebilmek için birden fazla catch bloðu yazabiliriz.
			System.out.println("hata oluþtu: " + exception.getMessage());
			System.out.println(exception);
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// Parametre olarak doðrudan Exception göndermek demek ayrý olarak belirtilen hatalar dýþýnda bir hata oluþtuðunda burasý çalýþýr
			System.out.println("Hata loglandý: " +e);
			// Örneðin burada oluþan hata loglanabilir. Bu sayede yazýlýmcý bu bilinmeyen hatadan haberdar edilir.
			
		}
		finally {
			System.out.println("Finally bloðu çalýþtý");

		}
		
		
	}

}
