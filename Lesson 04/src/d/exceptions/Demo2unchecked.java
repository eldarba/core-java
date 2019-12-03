package d.exceptions;

import java.util.Date;

import c.enumTypes.Car;

public class Demo2unchecked {

	public static void main(String[] args) {

		Object d = new Date();
		String str3 = (String) d;

		String str2 = "22A";
		int x = Integer.parseInt(str2);

		int[] arr2 = new int[3];
		arr2[3] = 10;

		int[] arr1 = new int[-9];

		String str = null;
		System.out.println(str.length());

		System.out.println(5 / 0);
	}
}
