package Algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 455, 74, 91, 245, 357};
		int[] sortedNumbers = {9, 12, 17, 54, 43, 89, 1, 3, 46, 22, 11};
		
		// call the linear function that searches for a specific number
		int pos = Algorithms.Search.LinearSearch(numbers, 74);
		System.out.println("Found at position " + pos);
		
		// call binarySearch function
		Algorithms.Search.binarySearch(sortedNumbers, 22, 0, sortedNumbers.length);
	}

}
