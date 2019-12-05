package e.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class DefaultIoObjects {

	public static void main(String[] args) {

		// 3 stream objects are always available when we start a program.
		PrintStream defaultOut = System.out; // object to print app output
		PrintStream defaultErr = System.err; // object to print app errors
		InputStream defaultIn = System.in; // object to read from default input

		System.out.println("aaa");
		System.out.close();

		try {
			int b = System.in.read();
			System.out.write(b);
			System.out.flush();

			System.out.println(b);
			System.out.println((char) b);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
