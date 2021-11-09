package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(40);
		arr.add(60);
		arr.add(20);
		arr.add(80);
		arr.add(90);
		System.out.println("Before sorting:"+arr);
		Collections.sort(arr);
		System.out.println("After sorting:"+arr);

	}

}
