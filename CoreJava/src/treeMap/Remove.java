package treeMap;

import java.util.TreeMap;

public class Remove {
	public static void main(String args[]) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(3, "Hi");
		tm.put(2, "Good");
		tm.put(1, "Morning");
		tm.put(4, "All");
		System.out.println(tm);

		tm.remove(4);

		System.out.println(tm);
	}
}
