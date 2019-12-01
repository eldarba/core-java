package e.singleton;

public class Test {

	public static void main(String[] args) {

		// 2 references to the same single instance
		Superman s1 = Superman.getInstance();
		Superman s2 = Superman.getInstance();

	}
}
