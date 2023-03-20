package SwitchStatementVsExpression;

public class Main {

	public static void main(String[] args) {
		
		String animal = "DOG";
		
		// break komutunu koymazsak ilgili case'den baþlayýp sona kadar devam eder.
		
	    switch (animal) {
	    // Eðer birden fazla case ayný iþleme sahipse onlarý alt alta yazabiliriz
	    case "DOG":
	    case "CAT":
	        System.out.println("domestic animal");
	        break;
	    case "TIGER":
	        System.out.println("wild animal");
	    	break;

	    }
	    System.out.println("***");
	    
	    switch (animal) {
		case "DOG" -> System.out.println("asd");
		case "CAT" -> System.out.println("CAT");
//		default -> throw new IllegalArgumentException("Unexpected value: " + animal);
		}
	    System.out.println("***");
	    
	    // Switch expression da lambda kullanýyoruz.
	    // Switch expression da default deðer girmemiz zorunlu. 
	    // Switch statement tan farklý olarak burada break komutu zorunlu deðil.
	    String month = "MAY";
	    int result = switch(month) {
	    case "JANUAR", "JUNE", "JULY" -> 3;
	    case "FEBRUAR", "SEPTEMBER" -> 2;
	    case "MARCH", "MAY" ->1;
	    default -> 0;
	    };
	    
	    System.out.println(result);
	    System.out.println("-------");
	    
	    String day = "WEDNESDAY";
	    
	    int numLetters = switch (day) {
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
			System.out.println(6);
			yield 6;
		case "THURSDAY":
		case "FRIDAY":
			System.out.println(8);
			yield 8;
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		};
	   
		System.out.println("-------");
		
		int numLetters2 = switch (day) {
		case "MONDAY", "TUESDAY", "WEDNESDAY" -> {
			System.out.println(6);
			yield 6;
		}
		case "THURSDAY" -> {
			System.out.println(9);
			yield 7;
		}
		
		default ->
		throw new IllegalArgumentException("Unexpected value: " + day);
		};
		
		System.out.println("---------");
		
		int apple = 12;
		int number = 10;
		switch (number) {
		
		// Aþaðýdaki case çalýþmaz çünkü apple constant bir sayý deðil
//		case apple:
//			System.out.println("asdþ");
			
//			break;

		default:
			break;
		}
		
		
		
	}

}
