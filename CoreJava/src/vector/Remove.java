package vector;

import java.util.Vector;

public class Remove {
	public static void main(String args[]) {
		Vector<String> vt = new Vector<String>();

		vt.add("Welcome");
		vt.add("To");
		vt.add("My");
		vt.add("World");
		vt.add("All");

		System.out.println("Vector: " + vt);

		// Clearing the Vector using clear() method
		//vt.clear();
		vt.remove(0);
		vt.remove("All");

		System.out.println("The final Vector: " + vt);
	}
}
