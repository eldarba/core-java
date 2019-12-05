package e.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

public class Demo4PrintWriter {

	public static void main(String[] args) {

		File directory = new File("files");
		File file = new File(directory, "file1.txt");

		try (PrintWriter out = new PrintWriter(file);) {
			out.println("this is a line of text");
			out.println(15);
			out.println(true);
			out.println(new Date());
			System.out.println("text written to " + file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
