package hashMap;

import java.util.HashMap;

public class Update {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 100);
		map.put("b", 300);
		map.put("c", 300);
		map.put("d", 400);

		System.out.println("HashMap: " + map.toString());

		// provide value for the key which has
		// to replace it's current value, and will
		// store the value in k using the
		// replace(K key, V value) method
		int k = map.replace("b", 200);

		System.out.println("Previous value of 'b': " + k);

		System.out.println("New HashMap: " + map.toString());
	}
}
