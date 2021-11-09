package linkedHashMap;

import java.util.LinkedHashMap;

public class Search {
	public static void main(String[] args) {

		LinkedHashMap<Integer, Integer> LHM = new LinkedHashMap<>();

		LHM.put(2, 6);
		LHM.put(4, 1);
		LHM.put(5, 10);
		System.out.println(LHM.containsValue(2));
		System.out.println(LHM.containsKey(2));
	}
}
