package a.ternary;

public class Demo {

	public static void main(String[] args) {

		int a = (int) (Math.random() * 11);
		int b = (int) (Math.random() * 11);
		int max = a > b ? a : b;

		System.out.println(a + ", " + b);
		System.out.println(max);
	}

}
