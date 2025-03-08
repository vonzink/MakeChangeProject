package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		double change = getAmount();
		stringChange(change);

	}

	public static double getAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is the price of the item?: "); // User Story #1
		double amountDue = sc.nextDouble();
		System.out.println("enter amount received: "); // User Story #2
		double amountReceived = sc.nextDouble();

		double changeDue = (amountReceived - amountDue) * 100.0;
		sc.close();

		if (changeDue < 0) { // User Story #3
			System.out.println(
					"amount received is insufficient by $" + (changeDue / 100.0 * -1) + ". please enter a new amount");
		} else if (amountReceived == amountDue) {
			System.out.println("no change needed");
		}
		return changeDue;
	}

	public static void stringChange(double change) { // User Story #4 (Whole Method)

		// int dollars100 = 0;
		// int dollars50 = 0;
		int dollars20 = 0;
		int dollars10 = 0;
		int dollars5 = 0;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickles = 0;
		int pennies = 0;

		while (change > 0) {
			// if (change >= 10000) {
			// dollars100++;
			// change = change - 10000;
			// }else if (change >= 5000) {
			// dollars50++;
			// change = change - 5000;
			if (change >= 2000) {
				dollars20++;
				change = change - 2000;
			} else if (change >= 1000) {
				dollars10++;
				change = change - 1000;
			} else if (change >= 500) {
				dollars5++;
				change = change - 500;
			} else if (change >= 100) {
				dollars++;
				change = change - 100;
			} else if (change >= 25) {
				quarters++;
				change = change - 25;
			} else if (change >= 10) {
				dimes++;
				change = change - 10;
			} else if (change >= 5) {
				nickles++;
				change = change - 5;
			} else {
				pennies++;
				change = change - 1;
			}
		}

		if (dollars20 == 1) {
			System.out.println("Change: " + dollars20 + " twenty dollar bill");
		} else if (dollars20 > 1) {
			System.out.println("Change: " + dollars20 + " twenty dollar bills");
		}
		if (dollars10 == 1) {
			System.out.println("Change: " + dollars10 + " ten dollar bill");
		} else if (dollars10 > 1) {
			System.out.println("Change: " + dollars10 + " ten dollar bills");
		}
		if (dollars5 == 1) {
			System.out.println("Change: " + dollars5 + " five dollar bill");
		} else if (dollars5 > 1) {
			System.out.println("Change: " + dollars5 + " five dollar bills");
		}
		if (dollars == 1) {
			System.out.println("Change: " + dollars + " one dollar bill");
		} else if (dollars > 1){
			System.out.println("Change: " + dollars + " one dollar bills");
		}
		if (quarters == 1) {
			System.out.println("Change: " + quarters + " quarter");
		} else if (quarters > 1){
			System.out.println("Change: " + quarters + " quarters");			
		}
		if (dimes == 1) {
			System.out.println("Change: " + dimes + " dime");
		} else if (dimes > 1) {
			System.out.println("Change: " + dimes + " dimes");			
		}
		if (nickles == 1) {
			System.out.println("Change: " + nickles + " nickel");
		} else if (nickles > 1) {
			System.out.println("Change: " + nickles + " nickels");
		}
		if (pennies == 1) {
			System.out.println("Change: " + pennies + " Penny");
		} else if (pennies > 1) {
			System.out.println("Change: " + pennies + " Pennies");	
		}
	}
}
// by ZVZ
