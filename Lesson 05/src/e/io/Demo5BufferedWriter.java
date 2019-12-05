package e.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class Demo5BufferedWriter {

	public static void main(String[] args) {

		File directory = new File("files");
		File file = new File(directory, "file1.txt");

		try (BufferedWriter out = new BufferedWriter(new FileWriter(file, true));) {
			out.write("first appended line");
			out.newLine();
			out.write("second appended line");
			out.newLine();
			System.out.println("text written to " + file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
