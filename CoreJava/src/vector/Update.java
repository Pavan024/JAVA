package vector;

import java.util.Vector;

public class Update {
	public static void main(String args[]) {
		Vector<String> vt = new Vector<String>();

		vt.add("Welcome");
		vt.add("To");
		vt.add("My");
		vt.add("World");
		vt.add("All");

		System.out.println("Vector: " + vt);

		System.out.println("The Object that is replaced is: " + vt.set(2, "Pavan"));

		System.out.println("The Object that is replaced is: " + vt.set(4, "50"));

		System.out.println("The new Vector is:" + vt);
	}
}
