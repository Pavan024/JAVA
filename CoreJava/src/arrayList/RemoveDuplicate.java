package arrayList;

/*import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(30);
		arr.add(60);
		arr.add(60);
		System.out.println(arr);
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		hs.addAll(arr);
		arr.clear();
		arr.addAll(hs);
		System.out.println(arr);
	}

}*/

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {

	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {

		ArrayList<T> newList = new ArrayList<T>();

		for (T element : list) {

			// If this element is not present in newList
			// then add it
			if (!newList.contains(element)) {

				newList.add(element);
			}
		}

		return newList;
	}

	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

		System.out.println("ArrayList with duplicates: " + list);

		ArrayList<Integer> newList = removeDuplicates(list);

		System.out.println("ArrayList with duplicates removed: " + newList);
	}
}
