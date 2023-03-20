package ThrowDemo;

public class AccountManager {

	private double balance;

	public double getBalance() {
		return balance;
	}
	// para yatýrma iþlemi
	public void deposit(double amount) {
		balance = getBalance() +amount;
	}
	


	// hesaptan para çekme
	// metodun yanýna throws Exception yazsak da olur. Ancak daha detaylý olmasý için Custom Exception u da yazabiliriz.
	public void withdraw(double amount) throws BalanceInsufficentException {
		
		if (balance>= amount) {
			balance = getBalance() - amount;
			
		} else {
			//throw new Exception("Bakiye yetersiz");
			// Burada genel bir Exception fýrlatmak yerine daha uygun custom Exception fýrlatabiliriz.
			// Örneðin throw new BalanceInsufficentException();
			throw new BalanceInsufficentException("Bakiye Yetersiz");
			
		}
		
	}
	
	
	

}
