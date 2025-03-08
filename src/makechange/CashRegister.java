package makechange;

import java.util.Scanner; 

public class CashRegister {

	public static void main(String[] args) {
	
		scanner(); 
		stringChange(); 
	}
	
	private static void stringChange() {
		
	}

	public static double scanner() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount due: "); 
		double amountDue = sc.nextDouble(); 
		System.out.println("enter amount received: "); 
		double amountReceived = sc.nextDouble(); 

		double changeDue = amountReceived -amountDue; 
		sc.close();	
		
		System.out.println(changeDue); 
		return changeDue; 
						
	}
	
	public static void stringChange (double changeDue) {
		
		

	}
}
	
