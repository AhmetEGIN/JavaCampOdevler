package Methods;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] numbers = new int[] { 2, 5, 7, 9, 0 };
		int numberToFind = 5;
		boolean isNumberExist = false;
		for (int num : numbers) {
			if (numberToFind == num) {
				isNumberExist = true;
				break;
			}
		}
		if (isNumberExist) {
			mesajVer("Aranan sayý mevcut: " + numberToFind);
		} else {
			mesajVer("Aranan sayý mevcut deðildir:" + numberToFind);

		}
	}
	
	

	public static void mesajVer(String message) {
		System.out.println(message);
	}

}
