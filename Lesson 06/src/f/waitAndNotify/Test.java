package f.waitAndNotify;

public class Test {

	public static void main(String[] args) {

		Stack stack = new Stack();

		Producer p1 = new Producer(stack, 5, 300, "p1");
		Consumer c1 = new Consumer(stack, 2, 700, "c1");
		Consumer c2 = new Consumer(stack, 3, 1500, "c2");

		p1.start();
		c1.start();
		c2.start();
	}

}
