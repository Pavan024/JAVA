package arrayList;

//Java program to demonstrate working of remove
//on an integer arraylist
import java.util.ArrayList;
import java.util.Iterator;

public class Remove {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);

		// This makes a call to remove(int) and
		// removes element 20.
		al.remove(1);

		// This makes a call to remove(Object) and
		// removes element 1
		al.remove(new Integer(1));

		System.out.println("Modified ArrayList : " + al);

		// Remove elements smaller than 20 using
		// Iterator.remove()
		Iterator it = al.iterator();
		while (it.hasNext()) {
			int x = (int) it.next();
			if (x < 20) {
				it.remove();
			}
		}
		System.out.println("Modified ArrayList : " + al);
	}
}
