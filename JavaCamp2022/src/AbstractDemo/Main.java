package AbstractDemo;

public class Main {

	public static void main(String[] args) {
		// Bir müþterinin veri tabanýna kaydedilmesi
		// Oracle, MsSql, MySql gibi farklý veri tabanlarý kullanýlacak
		// 
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.baseDatabaseManager = new SqlServerDatabaseManager();
		customerManager.getCustomers();

	}

}
