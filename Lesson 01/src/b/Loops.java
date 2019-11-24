package b;

public class Loops {

	public static void main(String[] args) {

		int c = 0;

		System.out.println("===== while loop");
		while (c < 10) {
			System.out.println(c);
			c++;
		}

		System.out.println("===== do while loop");
		c = 0;
		do {
			System.out.println(c);
			c++;
		} while (c < 10);

		System.out.println("===== for loop");

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
