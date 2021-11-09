package files;

import java.io.File;

public class GetInfo {
	public static void main(String[] args) {

		File f1 = new File("D:FileOperationExample.txt");
		if (f1.exists()) {

			System.out.println("The name of the file is: " + f1.getName());

			System.out.println("The absolute path of the file is: " + f1.getAbsolutePath());

			System.out.println("Is file writeable ?: " + f1.canWrite());

			System.out.println("Is file readable ?: " + f1.canRead());

			System.out.println("The size of the file in bytes is: " + f1.length());
		} else {
			System.out.println("The file does not exist.");
		}
	}
}