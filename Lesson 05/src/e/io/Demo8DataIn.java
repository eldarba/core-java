package e.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo8DataIn {

	public static void main(String[] args) {

		int x1;
		long x2;
		String str;
		boolean x3;
		char x4;

		try (DataInputStream in = new DataInputStream(
				new BufferedInputStream(new FileInputStream("files/data.jav")));) {
			// the reading order format must be known to the reader in order to get the
			// correct data.
			x1 = in.readInt();
			x2 = in.readLong();
			str = in.readUTF();
			x3 = in.readBoolean();
			x4 = in.readChar();

			System.out.println(x1);
			System.out.println(x2);
			System.out.println(str);
			System.out.println(x3);
			System.out.println(x4);

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
