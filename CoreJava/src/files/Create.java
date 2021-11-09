package files;

import java.io.File;
import java.io.IOException;

public class Create {
	public static void main(String args[]) {
		try {
			// Creating an object of a file
			File f1 = new File("D:FileOperationExample.txt");
			if (f1.createNewFile()) {
				System.out.println("File " + f1.getName() + " is created successfully.");
			} else {
				System.out.println("File is already exist in the directory.");
			}
		} catch (IOException e) {
			System.out.println("An unexpected error is occurred.");
			e.printStackTrace();
		}
	}
}