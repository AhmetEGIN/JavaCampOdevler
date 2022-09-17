package MiniProjeAsalSayý;

public class Main {

	public static void main(String[] args) {
		int number = 20;
		int bolum = number / 2;
		int kalan = number % 2; // remainder
		System.out.println(bolum);
		System.out.println(kalan);
		boolean isPrime = true;
		if(number == 1) {
			System.out.println("Sayý asal deðildir");
		}
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(number + ": Sayý asaldýr");

		} else {
			System.out.println("Sayý asal deðildir");
		}

		System.out.println("-----------");

		for (int j = 2; j < number; j++) {
			if (number % j == 0) {
				System.out.println("Sayý asal deðildir");
				break;
			}
			if (j == number - 1) {

				System.out.println("Sayý asaldýr");
			}
		}

		System.out.println("-------");

		int k = 2;
		while (k < number) {
			if (number % k == 0) {
				System.out.println("Sayý asal deðildir");
				break;
			}
			if (k == number - 1) {

				System.out.println("Sayý asaldýr");
			}
			k++;

		}

	}

}
