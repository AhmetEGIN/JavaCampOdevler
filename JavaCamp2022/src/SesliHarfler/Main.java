package SesliHarfler;

public class Main {

	public static void main(String[] args) {
		char character = 'ö';
		char[] harfler = { 'A', 'I', 'U', 'O' };
		for (char harf : harfler) {
			if (harf == character) {
				System.out.println("Kalýn sesli harf");
				return;
			}
		}
		System.out.println("Ýnce sesli harf");

		// ikinci yol -- switch case

		switch (character) {
		case 'A':
		case 'I':
		case 'U':
		case 'O':
			System.out.println("Kalýn sesli harf");
			break;
		default:
			System.out.println("Ýnce sesli harf");

		}

	}

}
