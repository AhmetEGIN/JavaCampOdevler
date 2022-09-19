package Methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		System.out.println(topla(2, 2));
		System.out.println(sehirVer());
		// istedimiz kadar deðeri metoda gönderebilmek için variable arguments kullanýlýr
		
		System.out.println(topla(3,2,3,4,5));
	}
	
	public static void ekle()
	{
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
		
	}
	public static void guncelle() {
		System.out.println("güncellendi");
		
	}
	
	public static int topla(int s1, int s2) {
		return s1+ s2;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	
	public static int topla(int...sayilar) {
		int toplam = 0;
		
		for(int sayi:sayilar) {
			toplam += sayi;
		}
		return toplam;
	}
}
