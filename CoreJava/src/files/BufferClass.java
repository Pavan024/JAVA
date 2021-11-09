package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferClass {

	public static void main(String[] args) throws IOException {

		FileReader fileread = new FileReader("D:File.txt");
		BufferedReader buff = new BufferedReader(fileread);
		int i;
		while ((i = buff.read()) != -1) {
			System.out.print((char) i);
		}
		buff.close();
		fileread.close();
	}

}