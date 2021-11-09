package hashMap;

import java.util.HashMap;

public class Remove {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(10, "Hi");
		hm.put(15, "Hello");
		hm.put(20, "Good");
		hm.put(25, "Morning");
		hm.put(30, "All");

		System.out.println("Initial Mappings are: " + hm);

		// Removing the existing key mapping
		String returned_value = (String) hm.remove(20);

		// Verifying the returned value
		System.out.println("Returned value is: " + returned_value);

		System.out.println("New map is: " + hm);
	}
}
