package files;

import java.io.File;

public class FilePermissions {

	public static void main(String[] args) {

		File file = new File("D:File.txt");

		if (file.exists()) {
			file.setExecutable(true);// file set to Executable
			file.setReadable(true);// file set to Readable
			file.setWritable(true);// file set to Writable
			System.out.println("File permissions changed.");
			
			// printing the permissions associated with the file
			System.out.println("Executable: " + file.canExecute());
			System.out.println("Readable: " + file.canRead());
			System.out.println("Writable: " + file.canWrite());
		} else {
			System.out.println("File not found.");
		}
	}
}