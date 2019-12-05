package e.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7DataOut {

	public static void main(String[] args) {

		int x1 = 456;
		long x2 = 15000;
		boolean x3 = true;
		char x4 = 'X';

		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("files/data.jav")));) {
			// the writing order format must be known to the reader in order to get the
			// correct data.
			out.writeInt(x1);
			out.writeLong(x2);
			out.writeUTF("Hello Data IO");
			out.writeBoolean(x3);
			out.writeChar(x4);

			System.out.println("data written");

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
