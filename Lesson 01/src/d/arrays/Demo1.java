package d.arrays;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		// System.out.println(args.length);

		// create array of int
		int[] arr = new int[5];
		// populate with elements
		arr[0] = 7;
		arr[1] = 3;
		arr[2] = 9;

		// access array elements
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);

		// print entire array as string
		System.out.println(Arrays.toString(arr));
	}
}
