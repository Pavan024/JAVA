package files;

import java.io.ByteArrayOutputStream;

import java.io.FileOutputStream;

import java.io.IOException;

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) throws IOException {

		FileOutputStream fout1 = new FileOutputStream("D:\\File.txt");
		FileOutputStream fout2 = new FileOutputStream("D:\\testout.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		bout.write(65);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.flush();
		bout.close();

		System.out.println("Success...");

	}

}