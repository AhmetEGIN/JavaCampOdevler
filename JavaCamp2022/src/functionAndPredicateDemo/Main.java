package functionAndPredicateDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class Person {
	private String firstName;
	private String lastName;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}

public class Main {

	public static void main(String[] args) {
//		Consumer : Paremetre alýp iþlem yapar ve geriye sonuç döndürmez.
//		void accept(T t);
		
//		Predicate: Parametre alýr ve þarta baðlý olarak boolean sonuç döndürür.
//		boolean test(T t);
		
//		Supplier: Hiç parametre almaz ancak T tipinde deðer döndürür.
//		T get();
		
//		Function: Parametre alýr, iþler ve geriye bir sonuç üretir.
//		R apply(T t);
		
		Function<Integer, Integer> math = x -> x*x;
		Predicate<String> p = str -> str.equals("def");
		System.out.println(p.test("def"));
		System.out.println(math.apply(3));
		
		
		// ## CONSUMER ##
		
	    // accept() metoduna String tipte bir parametre göndererek çalýþmasýný saðladýk.
        Consumer<String> consumer = name -> System.out.println("Ýsminiz : " + name);
        consumer.accept("Ahmet EGÝN"); // Çýktý => Ýsminiz : Ahmet EGÝN
        
        // andThen metodu ile iki tane Consumer'ý birleþtirebiliriz
        
        System.out.println("****");
        Person person = new Person("Ahmet","EGÝN");

        Consumer<Person> updateName = per -> per.setFirstName(per.getFirstName().toLowerCase());
        updateName = updateName.andThen(per -> per.setLastName(per.getLastName().toUpperCase()));
        updateName.accept(person);
        System.out.println(person.getFirstName() + " " + person.getLastName());
        
        
         // ## PREDICATE ##
        
//        Predicate arayüzü, Consumer arayüzü gibi T tipinde bir girdi alýr ve 
//        kendisine sunulan þartýn saðlanýp saðlanmadýðýný kontrol ederek geriye “true ya da false” deðer döner.
//        Boolean dönüþ deðerine sahip bir iþlev olarak düþünülebilir.
//        Filtreleme ve gruplama gibi iþlemlerde kullanýlýr.
        
        System.out.println("---");
        Predicate<Integer> isAEvenNumber = number -> number %2 ==0;
        boolean result = isAEvenNumber.test(5);
        System.out.println((result ? "Çift" : "Tek"));
        
//        and(): Ýki Predicate’i birleþtirir ve mantýkta ki ve (&&) iþlemine tabi tutar.
//        or(): and() ile aynýdýr ancak bu sefer mantýkta ki or iþlemine tabi tutulur.
//        negate(): Not ile ayný iþlevi görür. Sonuç neyse tersini geri döndürür.

        Predicate<String> predicate = name -> name == "Ahmet";
        predicate = predicate.and(name -> name.length() == 5);
        System.out.println(predicate.test("Ahmet"));
        Predicate<String> predicate2 = name -> name == "Ahmet";
        predicate2 = predicate2.or(name -> name.length() == 5);
        System.out.println(predicate2.test("abasd"));
        System.out.println("negate Predicate 'tan dönen sonucun tam tersini alýr: " + predicate.negate().test("Ahmet"));
        
        // Predicate lar bir çok metotta parametre olarak kullanýlabilir.
        // Predicate lar stream.filter metodunda da kullanýlýr
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(15, "asda"));
        students.add(new Student(27, "qwe"));
        students.add(new Student(12, "rty"));
        students.add(new Student(17, "yuý"));
        students.add(new Student(23, "fgj"));
        students.add(new Student(23, "adfa"));
        students.add(new Student(24, "kimasd"));
        
        Consumer<Student> consumer2 = student -> System.out.println("isim:" + student.getName() + "/" + student.getAge()); 
        students.stream().forEach(consumer2);
        System.out.println("####");
        Predicate<Student> predicate3 = student -> student.getAge() >16;
        List<Student> filtered = students.stream().filter(predicate3).toList();
        filtered.stream().forEach(consumer2);
        
        System.out.println("*******");
		// ## SUPPLÝER ##
//        Consumer arayüzünün tam tersini yapar. 
//        Yani girdi olarak bir þey almaz ancak geriye bir deðer döndürür.
        
        Supplier<String> supplier = () -> "Hoþgeldiniz: ";
        System.out.println(supplier.get());
        
        
        System.out.println("**********");
        // ## FUNCTÝON ##
//        Function<T, R>
//        Function arayüzü, jenerik olarak T tipinde bir parametre alýr, verilen iþi yürütür ve ardýndan R tipinde bir deðer döndürür.
        
        Function<Integer, Double> function2 = number -> number * 3.14;
        System.out.println(function2.apply(2));
        
        // Girilen parametre ve dönüþ tipi ayný olduðu durumlarda UnaryOperator kullanabiliriz.
        // Unary arayüzü Function arayüzünü kalýtmaktadýr.
        
        UnaryOperator<String> unaryOperator = string -> string.toUpperCase();
        System.out.println(unaryOperator.apply("asd"));
        
//        BiFunction<T, U, R>
        // BiFunction T ve U tiplerinde iki parametre alýr, R tipinde deðer döndürür
        // Function'dan tek farký iki parametre alabiliyor olmasýdýr.
        BiFunction<Integer, Integer, Double> biFunction = (sayi1, sayi2) -> {
        	Integer integerValue = sayi1 + sayi2;
        	Double doubleValue = integerValue.doubleValue();
        	return doubleValue;
        };
        
        Double biFunctionResult = biFunction.apply(5, 10);
        System.out.println(biFunctionResult);
        
	}

}

class Student {
	private int age;
	private String name;

	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
