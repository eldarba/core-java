package e.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2WriteToTxtFile {

	public static void main(String[] args) {

		File directory = new File("files");
		File file = new File(directory, "file1.txt");

		try (FileWriter out = new FileWriter(file);) {
			out.write("This is the first line of text\n");
			out.write("This is the second line of text\n");
			System.out.println("text written to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
