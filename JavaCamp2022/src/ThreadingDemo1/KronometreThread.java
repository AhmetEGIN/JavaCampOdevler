package ThreadingDemo1;

public class KronometreThread implements Runnable {
	// Runnable interface 'ini implemente ederek bu class'ýn thread güdümlü olabilmesini saðladýk
	private Thread thread;
	// Thread 'leri birbirinden ayýrt edebilmek için onlara isim veririz
	private String threadName;

	public KronometreThread(String threadName) {
		this.threadName = threadName;
		System.out.println("Oluþturuluyor: " + threadName);
		
	}

	@Override
	public void run() {
		System.out.println("Çalýþtýrýlýyor: " + threadName);

		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(threadName + ": " + i);
				Thread.sleep(1000); // Uygulamayý yavaþlatmak için kullanýlýr
			}
		} catch (InterruptedException e) {
			// InterruptedException -- Thread bozulursa oluþan hata
			System.err.println(e.getLocalizedMessage() + " " + threadName);
		}
		System.out.println("Thread bitti");

	}
	
	public void start() {
		System.out.println("Thread nesnesi oluþuyor ");
		if (thread == null) {
			thread = new Thread(this, threadName);
			thread.start();
		} 
		
	}
}
