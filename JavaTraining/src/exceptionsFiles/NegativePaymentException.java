package exceptionsFiles;

public class NegativePaymentException extends Exception {
	// Define class variable
	double payment;
	
	// 1. Constructor that takes the value that will throw the exception
	// 2. Assign value of local variable to class variable
	public NegativePaymentException(double payment) {
		 this.payment = payment;
	}
	// 3. Override tostring method
	public String toString() {
		return "ERROR: Cannot take negative payment " + payment;
	}
}
