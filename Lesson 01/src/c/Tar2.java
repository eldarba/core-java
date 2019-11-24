package c;

public class Tar2 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 16);
		int b = (int) (Math.random() * 16);

		System.out.println(a + ", " + b);

		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}

		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}
}
