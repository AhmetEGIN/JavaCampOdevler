package Overriding;

public class BaseKrediManager {
	public final double hesapla(double tutar) {
		
		return tutar * 1.18;
	}
	
	// bir classýn herhangi bir operasyonu aksi belirtilmediði sürece overridable dýr.
	// yani herhangi bir classý inherit eden baþka bir class bu metodu ezebilir
	// bir metodun override edilmesini engellemek için final anahtar kelimesini kullanabiliriz
}
