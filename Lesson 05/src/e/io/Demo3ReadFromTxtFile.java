package e.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo3ReadFromTxtFile {

	public static void main(String[] args) {

		File directory = new File("files");
		File file = new File(directory, "file1.txt");

		try (FileReader in = new FileReader(file);) {
			int c = in.read(); // read first character
			while (c != -1) {
				System.out.print((char) c);
				c = in.read(); // read next character
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
