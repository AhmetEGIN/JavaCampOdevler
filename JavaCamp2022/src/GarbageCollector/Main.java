package GarbageCollector;


class Meyve{
	private String name;

	public Meyve(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println(this.name+ " isimli obje ram'den silindi.");
//		finalize - obje ram’den silinirken çalýþýr
		// referansý olmayan objeler silinirken çaprýlan metottur
	}
	
}

public class Main {

	public static void main(String[] args) {
//		Çöp toplayýcýsýnýn mantýðý referans olarak gösterilemeyen alanlarýn silinmesini saðlamaktýr.

		Meyve m1 = new Meyve("Elma");
		System.out.println(m1.getName());
		// Java çöp toplama iþlemini kendisi gerçekleþtirir. 
		// Ama biz kendimizde garbage collectorü çalýþtýrabiliri.
		m1 = null;
		// Bir objenin referansýnýn null yapýlmasý durumunda unreferenced object meydana gelir.
//		System.gc();
		Meyve m2 = new Meyve("Armut");
		Meyve m3 = new Meyve("Kiraz");
		m2 = m3;
		// m2, m3 objesine eþitlendiðinde m2 objesininn eskiden gösterdiði alan artýk bilinmiyor.
//		System.gc();
		
		// Anonim obje oluþturursak adresi bilinmez.
		new Meyve("Karpuz");
		// Oluþturulan objenin heap'teki adresi elimizde yok.
		System.gc();
		
	}
	public static <T> void bol(int as, T item){
		
	}

}
