package files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//By implementing Serializable interface 
//we make sure that state of instances of class A 
//can be saved in a file. 

public class SeriazableExample implements Serializable {

	int i;
	String s;

	public SeriazableExample(int i, String s) {
		super();
		this.i = i;
		this.s = s;

	}

	static class Example {

		public static void main(String[] args) throws IOException, ClassNotFoundException {

			SeriazableExample a = new SeriazableExample(1, "Pavan");
			FileOutputStream fos = new FileOutputStream("File.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(a);

			// De-serializing 'a'
			FileInputStream fis = new FileInputStream("File.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			SeriazableExample b = (SeriazableExample) ois.readObject(); // down-casting object

			System.out.println(b.i + " " + b.s);

			oos.close();
			ois.close();
		}
	}
}