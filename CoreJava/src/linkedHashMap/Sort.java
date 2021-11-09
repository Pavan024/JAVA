package linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sort {
	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> lMap = new LinkedHashMap<>();

		// adding key-value pairs to LinkedHashMap object
		lMap.put(5, 4);
		lMap.put(3, 44);
		lMap.put(4, 15);
		lMap.put(1, 20);
		lMap.put(2, 11);
		System.out.println("Before Sorting: " + lMap);

		// convert to TreeMap
		Map<Integer, Integer> map = new TreeMap<>(lMap);
		System.out.println("After Sorting : " + map);

	}
}
