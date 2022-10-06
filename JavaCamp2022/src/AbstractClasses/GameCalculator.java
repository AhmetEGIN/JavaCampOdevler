package AbstractClasses;

public abstract class GameCalculator {
	
	// bir classýn veya operasyonun abstract keyword ü ile imzalanmasý gerekir
	// bir abstract class ta bir abstract operasyon olmasý zorunlu deðildir
	
	public abstract void hesapla();   // bu classý inherit eden classlar hesapla fonksiyonunu kendi yazmak zorunda
	public final void gameOver() {  // final anahtar kelimesi sayesinde bu classý inherit eden classlarýn bu fonksiyonu override etmesi engellenebilir
		System.out.println("Oyun bitti");
	}
}
