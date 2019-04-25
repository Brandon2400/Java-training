package DataStructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Implement map interfaces
		Map<Integer,String> hMap = new TreeMap<Integer,String>();
		mapUtil(hMap);
	}
	
	public static void mapUtil(Map<Integer,String> map) {
		// 1. Add Key-Value pairs
		map.put(101, "Steve");
		map.put(502, "Roger");
		map.put(22, "Joseph");
		map.put(315, "Kelly");
		map.put(785, "Mia");
		
		// 2. Expose / access elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all key-value pairs: " + map);
		
		
		// 3. Iterate through a map of key-value pairs
		for (int key : map.keySet()) {
			System.out.println("{KEY: " + key + ", VALUE: " + map.get(key) + "]");
		}
	}

}
