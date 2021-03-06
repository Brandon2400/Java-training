package oop;

public class BankAccountApp {

	public static void main(String[] args) {
			
		BankAccount acc1 = new BankAccount();
		
		// With Encapsulation : Public API methods
		acc1.setName("Roger Hugh");
		System.out.println(acc1.getName());
		acc1.setSsn("6354654");
		System.out.println("SSN: " + acc1.getSsn());
		
		acc1.AccountNumber = "3532165";
		acc1.balance = 1000;
		acc1.setRate();
		acc1.IncreaseRate();

		acc1.deposit(1500);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.AccountNumber = "0356546";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.AccountNumber = "1654645";
		/*
		acc3.checkbalance();
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.AccountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		 	*/
	}
}
