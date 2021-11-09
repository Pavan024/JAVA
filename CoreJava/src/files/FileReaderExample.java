package files;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {

		FileReader f1 = new FileReader("D:File.txt");
		int i = f1.read();
		while (i != -1) {
			System.out.println((char) i);
			i = f1.read();
		}
	}

}
