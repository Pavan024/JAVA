package files;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) {

		try {

			FileOutputStream outputStream = new FileOutputStream("D:File.txt");
			Writer outputStreamWriter = new OutputStreamWriter(outputStream);
			outputStreamWriter.write("Hi All Good Morning.");
			outputStreamWriter.close();

		} catch (Exception e) {

			e.getMessage();

		}

	}

}