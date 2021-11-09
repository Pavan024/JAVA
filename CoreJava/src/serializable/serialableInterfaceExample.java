package serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class serialableInterfaceExample implements Serializable {

	public static void main(String[] args) {
		Student stud = new Student(1, "Java");
		stud.name = "a";
		stud.id = 1;

		try {

			FileOutputStream fos = new FileOutputStream("D:File.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(stud);
			oos.close();
			fos.close();

			System.out.println("The object has been saved to file!");

		} catch (Exception e) {

			System.out.println(e);

		}

	}

}