package d.arrays;

import java.util.Arrays;

public class Demo8 {

	public static void main(String[] args) {

		int a = 5;

		System.out.println("dim 1: " + a);

		int[][] arr = new int[a][];

		for (int i = 0; i < arr.length; i++) {
			int r = (int) (Math.random() * 11);
			arr[i] = new int[r];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 11);
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
