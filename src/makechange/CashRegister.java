package makechange;

import java.util.Scanner; 

public class CashRegister {

	public static void main(String[] args) {
	
	double change = scanner(); 
	stringChange((int) change);
	
	}
	
	//private static void stringChange() {
		
	//	}

	public static double scanner() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount due: "); 
		double amountDue = sc.nextDouble(); 
		System.out.println("enter amount received: "); 
		double amountReceived = sc.nextDouble(); 

		double changeDue = (amountReceived -amountDue)* 100; 
		sc.close();	
		
		System.out.println(changeDue); 
		return changeDue; 
						
}
	
	public static void stringChange (int change) {
		
		
		int dollars = 0; 
		int quarters = 0; 
		int dimes = 0; 
		int nickles = 0;
		int pennies = 0;

		
		
		while (change > 0) {
		if (change >= 100) { 
				dollars++; 
				change = change - 100;
			}else if (change >= 25) { 
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
		System.out.println("dollars: " + dollars); 
		System.out.println("quarters: " + quarters); 
		System.out.println("dimes: " + dimes); 
		System.out.println("nickles: " + nickles);
		System.out.println("pennies: " + pennies); 
		System.out.println("enter amount received: " + change); 
		}
	}
	
