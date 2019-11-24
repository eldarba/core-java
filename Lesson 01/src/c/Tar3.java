package c;

public class Tar3 {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 16);
		int b = (int) (Math.random() * 16);

		System.out.println(a + ", " + b);
		int x = 1;

		if (a > b) {
			x = -1;
		}

		for (int i = a; i != b; i += x) {
			System.out.println(i);
		}
		System.out.println(b);
	}
}
