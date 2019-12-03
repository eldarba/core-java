package e.debugger;

public class MyMachine {

	private String name;

	public MyMachine(String name) {
		super();
		this.name = name;
	}

	public void f1() {
		System.out.println("===>method f1 of: " + this.name);
		System.out.println("===>method f1 of: " + this.name);
		f2();
		System.out.println("===>method f1 of: " + this.name);
		System.out.println("===>method f1 of: " + this.name);
	}

	public void f2() {
		System.out.println("===>method f2 of: " + this.name);
		System.out.println("===>method f2 of: " + this.name);
		f3();
		System.out.println("===>method f2 of: " + this.name);
		System.out.println("===>method f2 of: " + this.name);
	}

	public void f3() {
		System.out.println("===>method f3 of: " + this.name);
		System.out.println("===>method f3 of: " + this.name);
		System.out.println("===>method f3 of: " + this.name);
	}

}
