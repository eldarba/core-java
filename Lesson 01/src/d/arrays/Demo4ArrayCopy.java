package d.arrays;

import java.util.Arrays;

public class Demo4ArrayCopy {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8 };
		System.out.println(Arrays.toString(arr));

		// add 2 more elements
		// 1. create a new array of the correct size:
		int[] temp = new int[arr.length + 2];
		// 2. copy elements
		System.arraycopy(arr, 0, temp, 0, arr.length);
		// 3 reassign the arr reference to the new array object
		arr = temp;
		System.out.println(Arrays.toString(arr));

	}
}
