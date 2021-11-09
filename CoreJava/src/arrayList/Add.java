package arrayList;

import java.util.ArrayList;

public class Add {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(5, 60);
		for (Integer i : arr) {
			System.out.println("Number:" + i);
		}

	}

}
