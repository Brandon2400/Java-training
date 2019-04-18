package oop;

public class LoanAccount implements IRate {
	
	@Override
	public void setRate() {
		System.out.println("Rate");
	}
	
	@Override
	public void IncreaseRate() {
		System.out.println("Increase rate");
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " years.");
	}
	
	public void setAmmorSchedule() {
		System.out.println("Amortization schedule");
	}
}
