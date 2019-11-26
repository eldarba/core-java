package a;

import java.util.Arrays;
import java.util.Date;

/**
 * This class is just a demo
 */
public class Demo1 {

	public static void main(String[] args) {
		Date date1 = new Date(System.currentTimeMillis());
		Date date2 = new Date(System.currentTimeMillis() - 1000);
		boolean b = date1.before(date2);
		System.out.println(b);
		int[] arr = new int[6];
		Arrays a;
	}

}
