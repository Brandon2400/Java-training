package Basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA,numB);
		int product = multiplyNumbers(numA,numB);
		//System.out.println("The product of "+ numA + " and "+ numB + " is " + multiplyNumbers(numA,numB));
		System.out.println("The product of "+ numA + " and "+ numB + " is " + product);
	}
	
	static void printName() {
		System.out.println("My name is Tim");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of numbers "+ numberA + " and "+ numberB + " is "+ sum);
				
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product,product);
		return product;
	}
	
}
