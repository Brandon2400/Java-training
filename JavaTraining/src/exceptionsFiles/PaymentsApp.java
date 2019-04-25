package exceptionsFiles;

import java.util.Scanner;

public class PaymentsApp {

	
	// Take a payment from the user
	public static void main(String[] args) {
		
		// 1. Ask user for input
		// 2. Get the amount and test the value
		// 3. Handle exceptions appropriately 
		// 4. Print confirmation
		
		double payment = 0;
		boolean positivePayment = true;
		
		do {
			System.out.print("Enter the payment amount: ");
			
			Scanner in = new Scanner(System.in);				
			try {
				payment = in.nextDouble();
				if (payment < 0) {
					throw new NegativePaymentException(payment);
				}
				else {
					positivePayment = true;
				}
			
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please try again . . . ");
				positivePayment = false;
			}
		} while(!positivePayment);
		
		System.out.println("Thank you for your payment of �" + payment);
	}

}
