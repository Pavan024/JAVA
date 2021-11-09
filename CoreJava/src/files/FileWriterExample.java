package files;

import java.io.FileWriter;

import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {

		try {
			FileWriter fwrite = new FileWriter("D:File.txt");

			// writing the content
			fwrite.write("Hello World.");

			// Closing the stream
			fwrite.close();

			System.out.println("Content is successfully wrote to the file.");

		} catch (IOException e) {
			System.out.println("Unexpected error occurred");
			e.printStackTrace();
		}

	}

}