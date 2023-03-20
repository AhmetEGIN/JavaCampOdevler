package StaticDers;

public class CustomerManager {
	public static int customers;
	
	public String name11;
	
	public static void add(Customer customer) {
		int id = customer.getId() + 10;
		System.out.println("Müþteri eklendi" + customer.getFirstName() + customer.getLastName() +" düzenlenmiþ id: " + id);
		customers ++;
		
	}
	
	
	
}	
