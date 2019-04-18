package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.IncreaseRate();
		la.setRate();
		la.setAmmorSchedule();
		la.setTerm(20);
		
		// Polymorphism changes where we are pointing
		IRate account1 = new LoanAccount();
		account1.IncreaseRate();
		account1.setRate();
	}

}
