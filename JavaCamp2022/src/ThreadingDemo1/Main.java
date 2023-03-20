package ThreadingDemo1;

public class Main {

	public static void main(String[] args) {
		// SingleThread bir uygulamada önce bir operasyon yapýlýr bu operasyon bittikten sonra diðer operasyona geçer. Operasyon sýrasý böyle devam eder
		// MuktiThread bir uygulamada ise bir operasyon diðer operasyonun bitmesini beklemeden çalýþýr.
		// Burada önemli olan durum bir operasyonun kendinden bir önceki operasyona baðlý olup olmamasýdýr.
		// Operasyonlar birbirine baðlý ise multithread kullanmanýn bir anlamý yoktur.
		// Gerçek hayatta operasyonlar genelde birbirine baðlýdýr bu yüzden singleThread kullanýlýr
		
		KronometreThread kronometreThread1 = new KronometreThread("thread1");
		KronometreThread kronometreThread2 = new KronometreThread("thread2");
		KronometreThread kronometreThread3 = new KronometreThread("thread3");
		kronometreThread1.start();
		kronometreThread2.start();
		kronometreThread3.start();
//		kronometreThread1.run();
//		kronometreThread2.run();
//		kronometreThread3.run();
		
		
		
	}

}
