package hashMap;

import java.util.HashMap;
import java.util.TreeMap;

public class Sort {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(10, "Hi");
		hm.put(15, "Hello");
		hm.put(20, "Good");
		hm.put(25, "Morning");
		hm.put(30, "All");
		System.out.println("Before sorting: " + hm);
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
		System.out.println("Sorting by keys: " + tm);

	}
}
