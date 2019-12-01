package d.calculators;

public class Test {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator();
		Calculator c3 = new Calculator();

		c1.add(5);
		c2.add(100);
		c3.sub(3);

		// dynamic reference
		System.out.println(c1.getRes());
		System.out.println(c2.getRes());
		System.out.println(c3.getRes());

		// static reference
		System.out.println(Calculator.sum(4, 3));
	}
}
