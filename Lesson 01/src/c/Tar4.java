package c;

public class Tar4 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 101);

		while (x % 3 != 0 || x % 5 != 0) {
			System.out.println(x);
			x = (int) (Math.random() * 101);
		}

		System.out.println(x);
	}

}