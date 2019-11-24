package b;

public class App2If {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 11);
		System.out.println(r);

		if (r > 5) {
			System.out.println("Big");
		} else {
			System.out.println("Small");
		}
	}

}
