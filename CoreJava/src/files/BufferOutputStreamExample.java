package files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("D:File.txt");

		BufferedOutputStream bout = new BufferedOutputStream(fout);

		String s = "Welcome to BufferOutputStreamClass.";

		byte b[] = s.getBytes();

		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();

		System.out.println("success");

	}

}
