package ReCapDemo_Classes;

public class DortIslem {
	public int Topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public int C�kar(int sayi1, int sayi2) {
		return sayi1 - sayi2;

	}
	public int Carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
		
	}
	public double Bol(int sayi1, int sayi2) {
		if (sayi2 == 0) {
			System.out.println("0 ile b�lme yap�lmaz");
		}
		return sayi1/sayi2;
		
	}
	
	
}
