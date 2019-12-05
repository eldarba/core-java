package d.enhancedSyntax;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo2ARM {

	public static void main(String[] args) {
		// ARM - Auto Resource Management

		File file = new File("files/letter.txt");

		// try with resources - ARM - will close the scanner by the end of the try block
		try (Scanner sc = new Scanner(file)) {

			String a = sc.next();
			String b = sc.next();
			String c = sc.next();

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
