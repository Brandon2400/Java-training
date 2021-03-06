package oop;

public class BankAccount implements IRate {
	// Define variables
	String AccountNumber;
	
	// static >> belongs to the CLASS not the object instance
	// final >> constant 
	private static final String routingNumber = "0554";
	
	// instance variables
	private String name;
	private String ssn;
	String AccountType;
	double balance = 0;
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	BankAccount(String AccountType){
		System.out.println("NEW ACCOUNT: " + AccountType);
	}
	BankAccount(String AccountType, double initDeposit){
		System.out.println("NEW ACCOUNT: " + AccountType);
		System.out.println("INITIAL DEPOSIT OF: �" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = ("ERROR Minimum deposit must be atleast �1000");
		} else {
			Msg = "Thanks for your initial deposit of: �" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	
	// Getters and Setters
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void IncreaseRate() {
		System.out.println("INCREASING RATE");
	}

	// define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	// Private: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION " + activity);
		System.out.println("YOUR NEW BALANCE IS: �"+ balance);
		
	}
	
	void checkbalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "[ NAME:" + name + ", ACCOUNT# " + AccountNumber + ", ROUTING# " + routingNumber + ", BALANCE: �" + balance + "]";
	}
}
