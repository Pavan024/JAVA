package linkedHashMap;

import java.util.LinkedHashMap;

public class Remove {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();

		map.put(10, "Hi");
		map.put(15, "Hello");
		map.put(20, "Good");
		map.put(25, "Morning");
		map.put(30, "All");
		System.out.println(map);

		map.remove(30);
		map.remove(25, "Morning");

		System.out.println(map);
	}
}
