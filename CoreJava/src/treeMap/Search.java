package treeMap;

import java.util.TreeMap;

public class Search {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(3, "Hi");
		tm.put(2, "Good");
		tm.put(1, "Morning");

		System.out.println(tm);

		System.out.println(tm.containsKey(4));
		System.out.println(tm.containsValue("Good"));

	}

}
