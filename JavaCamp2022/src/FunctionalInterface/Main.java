package FunctionalInterface;

@FunctionalInterface
interface Interface1<T extends B> {
	void run(T item);
	// Functional Interface'te sadece bir metot olur
	
}



public class Main {

	public static void main(String[] args) {
		
		Interface1<C> interface1 = (f) -> System.out.println(f+"interface1 is running");
		
		B b = new B();
		C c = new C();
		interface1.run(c);
		
	}

}
