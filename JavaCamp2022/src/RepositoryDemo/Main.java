package RepositoryDemo;

public class Main {

	public static void main(String[] args) {
		// Veri tabaný nesneleri için ekleme, güncelleme, silme, data çekme iþlemleri aynýdýr. 
		// Tek fark kullanýlan alanlarr deðiþir: Customer, Product, Order
		
		Validator validator = new Validator();
		validator.validate(new Customer());

	}

}
