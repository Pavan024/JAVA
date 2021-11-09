package files;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) {

		byte[] buf = { 65, 66, 67, 68 };

		ByteArrayInputStream byt = new ByteArrayInputStream(buf);

		int k = 0;

		while ((k = byt.read()) != -1) {

			// Conversion of a byte into character

			char ch = (char) k;

			System.out.println("ASCII value of Character is:" + k + " Special character is: " + ch);

		}
	}
}
