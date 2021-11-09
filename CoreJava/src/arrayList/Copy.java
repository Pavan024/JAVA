package arrayList;

import java.util.ArrayList;

/*
class Copy {
	public static void main(String[] args) {

		ArrayList<Integer> gfg = new ArrayList<>();

		gfg.add(10);
		gfg.add(21);
		gfg.add(22);
		gfg.add(35);

		// Assigning the first reference to second
		ArrayList<Integer> gfg2 = gfg;

		// Iterating over second ArrayList
		System.out.println("-----Iterating over the second ArrayList----");
		for (Integer value : gfg2) {
			System.out.println(value);
		}

		// here we changed the third element to 23
		// we changed in second list and you can
		// see the same change in the first Arraylist
		gfg2.set(2, 23);

		System.out.println("third element of first list =" + gfg.get(2));
		System.out.println("third element of second list =" + gfg2.get(2));
	}
}
*/
class Copy {
	public static void main(String[] args) {
		ArrayList<Integer> gfg = new ArrayList<>();

		gfg.add(10);
		gfg.add(21);
		gfg.add(22);
		gfg.add(35);

		// passing in the constructor
		ArrayList<Integer> gfg2 = new ArrayList<>(gfg);

		// Iterating over second ArrayList
		System.out.println("-----Iterating over the second ArrayList----");
		for (Integer value : gfg2) {
			System.out.println(value);
		}

		// here we changed the third element to 23
		// we changed in second list and you can
		// here we will not see the same change in the first
		gfg2.set(2, 23);

		System.out.println("third element of first list =" + gfg.get(2));
		System.out.println("third element of second list =" + gfg2.get(2));
	}
}