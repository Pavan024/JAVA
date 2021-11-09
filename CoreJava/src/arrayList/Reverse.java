package arrayList;

import java.util.ArrayList;
import java.util.Collections;

/*
class RevArrayList {

	// Takes an arraylist as a parameter and returns
	// a reversed arraylist
	public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist) {
//		ArrayList<Integer> revArrayList = new ArrayList<Integer>();
//		for (int i = alist.size() - 1; i >= 0; i--) {
//
//			revArrayList.add(alist.get(i));
//		}
//
//		return revArrayList;
				//or
		// Arraylist for storing reversed elements
		// this.revArrayList = alist;
		for (int i = 0; i < alist.size() / 2; i++) {
			Integer temp = alist.get(i);
			alist.set(i, alist.get(alist.size() - i - 1));
			alist.set(alist.size() - i - 1, temp);
		}
		return alist;
	}

	public void printElements(ArrayList<Integer> alist) {
		for (int i = 0; i < alist.size(); i++) {
			System.out.print(alist.get(i) + " ");
		}
	}
}

public class Reverse {
	public static void main(String[] args) {
		RevArrayList obj = new RevArrayList();

		ArrayList<Integer> arrayli = new ArrayList<Integer>();

		arrayli.add(1);
		arrayli.add(2);
		arrayli.add(3);
		arrayli.add(4);
		System.out.print("Elements before reversing:");
		obj.printElements(arrayli);
		arrayli = obj.reverseArrayList(arrayli);
		System.out.print("\nElements after reversing:");
		obj.printElements(arrayli);
	}
}
*/

public class Reverse {
	public static void main(String[] args) {
		ArrayList<Integer> arrayli = new ArrayList<Integer>();

		arrayli.add(1);
		arrayli.add(2);
		arrayli.add(3);
		arrayli.add(4);
		arrayli.add(5);
		System.out.print("Elements before reversing: ");
		printElements(arrayli);

		// Collections.reverse method takes a list as a
		// parameter and reverses the passed parameter(no new array list is required)
		Collections.reverse(arrayli);
		System.out.print("\nElements after reversing: ");
		printElements(arrayli);
	}

	public static void printElements(ArrayList<Integer> alist) {
		for (int i = 0; i < alist.size(); i++) {
			System.out.print(alist.get(i) + " ");
		}
	}
}
