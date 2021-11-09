package hashMap;

import java.util.HashMap;

class Search {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();

		hashMap.put("key1", 1);
		hashMap.put("key2", 2);
		hashMap.put("key3", 3);
		hashMap.put("key4", 4);

		// calling the containsValue() method
		System.out.println(hashMap.containsValue(5));
		// calling the containsKey() method
		System.out.println(hashMap.containsKey("key2"));
	}
}
