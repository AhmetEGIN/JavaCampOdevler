package ProjectATM;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName;
		String password;
		int price;
		int select = 0;
		Scanner scan = new Scanner(System.in);
		CardManager cardManager = new CardManager();
		PayManager payManager = new PayManager(cardManager);

		for (int right = 3; right >= 0; right--) {
			System.out.println("Enter your username: ");
			userName = scan.nextLine();
			System.out.println("Enter your password: ");
			password = scan.nextLine();
			Card _card = cardManager.GetCard(userName, password);
			if (_card != null) {
				System.out.println("Hello " + userName);
				do {
					System.out.flush();
					System.out.println("1-Balance inquiry \n2- Withdrawal \n3-Deposit \n4- Exit");
					select = scan.nextInt();
					switch (select) {
					case 1:
						Sleep(1000);
						System.out.println("Balance inquiry: " + payManager.BalanceInquiry(_card));
						break;
					case 2:
						System.out.println("Amount:");
						price = scan.nextInt();
						payManager.Withdrawal(_card, price);
						Sleep(2000);
						System.out.println("Balance inquiry: " + payManager.BalanceInquiry(_card));
						break;
					case 3:
						System.out.println("Amount:");
						price = scan.nextInt();
						payManager.Deposit(_card, price);
						Sleep(2000);
						System.out.println("Balance inquiry: " + payManager.BalanceInquiry(_card));
						break;
					default:
						break;
					}
				} while (select != 4);

			} else {

				System.out.println("Wrong username or password. Try again");
				if (right == 0) {
					System.out.println("Your card has been blocked.");
					break;
				} else {
					System.out.println("Your remaining rights:" + right);
				}
			}
		}

	}
	private static void Sleep(int duration) {
		try {
			Thread.sleep(duration);
		} catch (InterruptedException ex) {
			System.err.println(ex);
		}
	}

}
