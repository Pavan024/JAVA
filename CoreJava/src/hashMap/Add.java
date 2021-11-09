package hashMap;

import java.util.HashMap;

public class Add {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(10, "Hi");
		hm.put(15, "Hello");
		hm.put(20, "Good");
		hm.put(25, "Morning");
		hm.put(30, "All");

		System.out.println("Initial Mappings are: " + hm);

		// Inserting new key along with new value
		String returned_value1 = (String) hm.put(50, "you");
		// Inserting existing key along with new value
		String returned_value2 = (String) hm.put(20, "All");

		// Verifying the returned value
		System.out.println("Returned value is: " + returned_value1);
		System.out.println("Returned value is: " + returned_value2);

		System.out.println("New map is: " + hm);
	}
}