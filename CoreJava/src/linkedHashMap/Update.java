package linkedHashMap;

import java.util.LinkedHashMap;

public class Update {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(10, "Hi");
		map.put(15, "Hello");
		map.put(20, "Good");
		map.put(25, "Morning");
		map.put(30, "All");

		System.out.println(map);
		map.replace(15, "Pavan");
		map.replace(30, "All", "Welcome");
		System.out.println(map);

	}

}
