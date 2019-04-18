package Basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);	
		
		// Declare the array
		String[] Countries;
		
		// Define the array
		Countries = new String[3];
		Countries[0] = "USA";
		Countries[1] = "Canada";
		Countries[2] = "UK";
		System.out.println(Countries[1]);
		System.out.println("********************");
		
		
		// Declare and define the array (only size)
		String[] States = new String[5];
		States[0] = "California";
		States[1] = "Ohio";
		States[2] = "New Jersey";
		States[3] = "Texas";
		States[4] = "Utah";		
		int i = 0;
		// Do loop: enters the loop then tests condition
		do {
			System.out.println("STATE: "+ States[i]);
			i++;
		} while (i < 5);
		System.out.println("**********");
		
		// While loop: tests condition first then enters loop
		int n = 0;
		boolean StateFound = false;	
		while (!StateFound) {
			String state = States[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND!");
				StateFound = true;
			}
			n++;
			
		}
		System.out.println("\nPRINTING WITH FOR LOOP");
		// For loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println(States[x]);
		}
	}

}
