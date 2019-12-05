package e.io;

import java.io.File;
import java.io.IOException;

public class Demo1File {

	public static void main(String[] args) {
		try {

			File directory = new File("c:/eldar/temp");
			File file = new File(directory, "file1.txt");

			if (!directory.exists()) {
				System.out.println("directory not exist");
				directory.mkdirs();
				System.out.println(directory + " directory created");
			} else {
				System.out.println("directory exist");
				System.out.println("is directory: " + directory.isDirectory());
				System.out.println("is file: " + directory.isFile());
			}

			if (!file.exists()) {
				System.out.println("file not exist");
				file.createNewFile();
				System.out.println(file + " file created");
			} else {
				System.out.println("file exist");
				System.out.println("is directory: " + file.isDirectory());
				System.out.println("is file: " + file.isFile());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
