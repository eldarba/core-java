package d.arrays;

import java.util.Arrays;

public class Demo7 {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 5, 5, 5, 5, 5 }, { 100, 100 } };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
