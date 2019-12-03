package e.debugger;

public class Test {

	public static void main(String[] args) {

		MyMachine m1 = new MyMachine("A");
		MyMachine m2 = new MyMachine("B");

		System.out.println("breakpoint here");

		m1.f1();
		m2.f1();
	}

}
