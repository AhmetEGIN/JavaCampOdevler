package SayıBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {2,5,7,9,0};
		int numberToFind = 56;
		boolean isNumberExist = false;
		for(int num : numbers) {
			if(numberToFind==num) {
				isNumberExist = true;
				break;
			}
		}
		if (isNumberExist) {
			System.out.println("Aranan sayı mevcut");
		} else {
			System.out.println("Aranan sayı mecut değil");

		}
	}

}
