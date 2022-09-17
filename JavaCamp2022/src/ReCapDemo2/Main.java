package ReCapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = { 8.2, 1.3, 4.3, 5.6 };
		double sum = 0;
		double max = myList[0];

		for (double number : myList) {
			sum += number;
			if (number > max) {
				max = number;

			}
		}
		System.out.println("Toplam= " + sum);
		System.out.println("En büyük sayý= " + max);
	}

}
