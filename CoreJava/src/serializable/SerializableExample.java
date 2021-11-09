package serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}

public class SerializableExample {

	public static void main(String args[]) {
		try {
			// Creating the object
			Student s1 = new Student(52, "Pavan");

			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("testout.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(s1);
			out.flush();

			out.close();
			System.out.println("success");

		} catch (Exception e) {

			System.out.println(e);
		}
	}
}