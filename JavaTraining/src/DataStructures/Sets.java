package DataStructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// 1. Define the collection
		Set<String> animals = new TreeSet<String>();
		// LinkedHash - order that they were entered
		// HashSet - complete random order
		// TreeSet - alphabetical order
		
		// 2. Adding elements
		animals.add("dog");
		animals.add("pig");
		animals.add("snake");
		animals.add("cat");
		
		animals.add("snake");
		animals.add("cat");
		animals.add("fox");
		System.out.println(animals.size() + " " + animals);
		
		// Create a new set that we use for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		// What is the INTERSECTION (farmAnimals AND animals)
		// what are the shared properties
		// 1. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		// 2. Retain only the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		// What is the UNION (are in both animals and farmAnimals
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// What is the DIFFERENCE
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is: " + differenceSet);
	}

}
