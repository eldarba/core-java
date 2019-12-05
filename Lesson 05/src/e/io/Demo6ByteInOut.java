package e.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6ByteInOut {

	public static void main(String[] args) {

		long ts1 = System.currentTimeMillis();

		try (

				BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/horse.jpg"));

				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("files/horseCopy.jpg"));

		) {

			int b = in.read(); // read first byte
			while (b != -1) {
				out.write(b); // write current byte
				b = in.read(); // read next byte
			}

			System.out.println("copy completed");

		} catch (IOException e) {
			e.printStackTrace();
		}
		long ts2 = System.currentTimeMillis();

		System.out.println(ts2 - ts1 + " ms");

	}

}
