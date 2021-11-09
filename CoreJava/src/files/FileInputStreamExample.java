package files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {

		try {

			InputStream stream = new FileInputStream("D:File.txt");
			Reader reader = new InputStreamReader(stream);
			int data = reader.read();
			while (data != -1) {

				System.out.print((char) data);
				data = reader.read();

			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}