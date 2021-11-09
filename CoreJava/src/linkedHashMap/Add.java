package linkedHashMap;

import java.util.LinkedHashMap;

public class Add {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(10, "Hi");
		map.put(15, "Hello");
		map.put(20, "Good");
		map.put(25, "Morning");
		map.put(30, "All");
		// Displaying key
		System.out.println("Keys: " + map.keySet());

		// Displaying value
		System.out.println("Values: " + map.values());

		// Displaying key-value pair
		System.out.println("Key-Value pairs: " + map.entrySet());
	}
}
