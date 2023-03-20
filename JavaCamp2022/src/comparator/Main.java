package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Phone {
	private int ram;
	private int price;

	public Phone(int ram, int price) {
		super();
		this.ram = ram;
		this.price = price;
	}

	public Phone() {
		super();
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
public class Main {

	public static void main(String[] args) {
		Comparator<Phone> comparator = new Comparator<Phone>() {
			
			@Override
			public int compare(Phone o1, Phone o2) {
				return o1.getPrice() - o2.getPrice();
			}
		};
		
		Comparator<Phone> comparator2 = (item1, item2) -> {
			return item1.getPrice() - item2.getPrice();
		};
		
		List<Phone> phones = new ArrayList<>() {{
			add(new Phone(10, 10000));
			add(new Phone(10, 9000));
			add(new Phone(10, 12000));
			add(new Phone(10, 10000));
			add(new Phone(10, 1000));
			add(new Phone(10, 15000));
			}
		};
		
//		Collections.sort(phones, comparator2);
		Collections.sort(phones, (item1, item2) -> {return (item1.getPrice() - item2.getPrice());});
		
		phones.stream().forEach(item -> System.out.println(item.getPrice()));
		
		Comparable<Phone> comparable = new  Comparable<Phone>() {
			
			@Override
			public int compareTo(Phone o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
	}

}
