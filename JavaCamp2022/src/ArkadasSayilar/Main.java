package ArkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// en küçük iki sarkadaþ sayý: 220-284
		// kendileri hariç poitif tam bölenleri toplamý birbirne eþit olan sayýlara
		// denir

		int number1 = 220;
		int number2 = 284;
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				sum1 += i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				sum2 += i;
			}
		}
		System.out.println(sum1);
		System.out.println(sum2);
		// && = and baðlacý
		// || = or baðlacý
		if (sum1 == number2 && sum2 == number1) {
			System.out.println("Bu iki sayý arkadaþ sayýdýr");
		} else {
			System.out.println("Bu iki sayý arkadaþ sayý deðildir");

		}

	}

}
