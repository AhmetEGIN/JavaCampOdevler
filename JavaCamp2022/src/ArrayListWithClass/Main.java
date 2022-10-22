package ArrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Class'lar ile de arrayList kullanýlabilir.
		// Bir veri kaynaðýnda müþteriler var diyelim. Bu müþterileri bir listeye koyabiliriz.
		Customer customer1 = new Customer(1, "Ahmet", "EGÝN");
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(new Customer(2, "Engin", "Demiroð"));
		customers.add(new Customer(3, "Derin", "Demiroð"));
		
		for (Customer customer : customers) {
			System.out.println(customer.firstName + customer.lastName);
		}
		System.out.println("-------------");
		// bir nesneyi sildiðimiz zaman onu newleyip bulamayýz
		// customers.remove(new Customer(2, "Engin", "Demiroð")); burada farklý bir referans oluþacaðý için bu nesne silinmez
		customers.remove(customer1);  // bu durumda referansý verdiðimiz için silinir
		for (Customer customer : customers) {
			System.out.println(customer.firstName + customer.lastName);
		}
		
		System.out.println("************");
		String name = "Engin";
		
		Customer personToDelete ;
		for(Customer customer : customers) {
			if(customer.firstName == name) {
				personToDelete = customer;
				customers.remove(personToDelete);
			}
		}
		for (Customer customer : customers) {
			System.out.println(customer.firstName + customer.lastName);
		}
	}

}
