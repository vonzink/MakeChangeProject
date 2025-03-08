package makechange;

import java.util.Scanner; 

public class CashRegister {

	public static void main(String[] args) {
	
	double change = getAmount(); 
	stringChange((int)change);
	
	}
		
	//gets amount due and received. returns value in pennies
	public static double getAmount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount due: "); 
		double amountDue = sc.nextDouble(); 
		System.out.println("enter amount received: "); 
		double amountReceived = sc.nextDouble(); 

		double changeDue = (amountReceived -amountDue)* 100.0; 
		sc.close();	
		
		if (changeDue < 0) {
			System.out.println("amount received is insufficient by $" + (changeDue / 100.0 * -1) +". please enter a new amount");
		} else {
		System.out.println(changeDue); 
		}	
		return changeDue; 
}
	
	public static void stringChange (int change) {
		
		//the logic, tallie each of the possible options. 
	//	int dollars100 = 0; 
	//	int dollars50 = 0; 
		int dollars20 = 0; 
		int dollars10 = 0; 
		int dollars5 = 0; 
		int dollars = 0; 
		int quarters = 0; 
		int dimes = 0; 
		int nickles = 0;
		int pennies = 0;

		
		
			while (change > 0) {
			//	if (change >= 10000) { 
			//		dollars100++; 
			//		change = change - 10000;
			//	}else if (change >= 5000) { 
			//		dollars50++; 
			//		change = change - 5000;
				if (change >= 2000) { 
					dollars20++; 
					change = change - 2000;
				}else if (change >= 1000) {
					dollars10++; 
					change = change - 1000; 
				}else if (change >= 500) { 
					dollars5++; 
					change = change - 500; 
				}else if (change >= 100) { 
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
		
			
			
			//System.out.println("dollars100: " + dollars100); 
			//System.out.println("dollars50: " + dollars50); 
		if (dollars20 > 0) {
			System.out.println("20s: " + dollars20); 
			}
		
			System.out.println("10s: " + dollars10); 
		System.out.println("dollars5: " + dollars5); 
		System.out.println("dollars: " + dollars); 
		System.out.println("quarters: " + quarters); 
		System.out.println("dimes: " + dimes); 
		System.out.println("nickles: " + nickles);
		System.out.println("pennies: " + pennies); 
		System.out.println(change); 
		
		
		
		}
	}
	
