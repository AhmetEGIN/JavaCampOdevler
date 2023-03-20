package Generics;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// java, c# gibi diller tip güvenli dillerdir.
		ArrayList demo = new ArrayList();
		demo.add(2);
		demo.add("ANkara");
		// ArrayList'in default halinde her tip listeye eklenebilir. Object tipindedir
		ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("Ýstanbul");
		sehirler.add("Ýzmir");
		// Tip güvenli  çalýþmak için genericlerden faydalanýrýz
		// Örneðin veri tabaný ile iþlem yapýlacaksa veri tabaný nesnesi isteriz. Mesela Veri tabanýna Validation class'ý göndermek istemeyiz
		
		Customer customer = new Customer();
		MyList<Customer> customers = new MyList<Customer>();
		customers.add(customer);
		
	}
}
