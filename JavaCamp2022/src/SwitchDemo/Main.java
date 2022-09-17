package SwitchDemo;

public class Main {

	public static void main(String[] args) {
		// switch, if else ye göre daha az kullanýlýr
		char grade = 'g';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel, geçtiniz");
			break;
		case 'B':   // iki case için ayný sonucu üretir
		case 'C':
			System.out.println("Ýyi, geçtiniz");
			break;
		case 'D':
			System.out.println("Fena deðil, geçtiniz");
		case 'F':
			System.out.println("Maalesef kaldýnýz");

		default: // default bu notlarýn dýþýnda herhangi bir not girildiðinde çalýþýr
			System.out.println("Geçersiz bir not girdiniz");
			break;
		}

	}

}
