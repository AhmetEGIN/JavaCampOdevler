package ThrowDemo;

public class Main {

	public static void main(String[] args) {
		// Örneðin bir tane paket hazýrladýk. Bu paketi baþka bir yerde kullanýlacak.
		// hazýrladýðýmýz pakette yapýlan iþlemlerde throw ifadesi ile hata fýrlatýrýz. Bunun amacý bu paketi kullanacak olan kiþi
			// bu hatadan haberi olsun.
		
		AccountManager manager = new AccountManager();
		manager.deposit(100);
		System.out.println("Hesap: " + manager.getBalance());
		try {
			manager.withdraw(200);
			
		} catch (BalanceInsufficentException e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("Hesap: " + manager.getBalance());
	}

}
