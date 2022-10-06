package Interfaces;

public class Main {

	public static void main(String[] args) {
		// classlarýn içerisinde metot koyduðumuz zaman bu metotlarýn içinin doldurulmasý gerekir
		// abstract classlarda boþ metot býrakýlýrsa onu inherit eden class doldurmak zorunda
		// interface ise sadece metotlarýn imzalarýný içerir. Onu implemente eden bu metotlarý doldurur
		// interfaceler newlenemez
		// operasyon implemente edilmesi gerekiyorsa interface kullanýlýr
		// interfaceler kendini implemente eden classlarýn referansýný tutabilir
		// ICustomerDal customerDal = new MySqlCustomerDal();
		
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
		
		

	}
}
