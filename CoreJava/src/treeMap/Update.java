package treeMap;

import java.util.TreeMap;

public class Update {
	public static void main(String args[]) {

		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(3, "Hi");
		tm.put(2, "Good");
		tm.put(1, "Morning");

		System.out.println(tm);

		tm.put(2, "For");

		System.out.println(tm);
	}
}
