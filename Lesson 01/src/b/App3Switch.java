package b;

public class App3Switch {

	public static void main(String[] args) {

		int r = (int) (Math.random() * 5) + 1;
		System.out.println(r);

		switch (r) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("Some other value");
			break;
		}

	}

}
