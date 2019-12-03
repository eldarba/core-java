package d.exceptions;

public class Demo1 {

	public static int div1Unchecked(int a, int b) throws RuntimeException { // // handling 1 - optional
		if (b != 0) {
			return a / b; // all is good
		} else {
			RuntimeException e = new RuntimeException("divide by 0 - eldar");
			throw e; // something went wrong
		}

	}

	public static int div2Checked(int a, int b) throws Exception { // handling 1
		if (b != 0) {
			return a / b; // all is good
		} else {
			Exception e = new Exception("divide by 0 - eldar");
			throw e; // something went wrong
		}

	}

	public static void main(String[] args) {
		System.out.println(div1Unchecked(10, 2));
//		System.out.println(div1Unchecked(10, 0));

		try {
			System.out.println(div2Checked(10, 5));
			System.out.println(div2Checked(10, 5));
			System.out.println(div2Checked(10, 0));
			System.out.println(div2Checked(10, 5));
		} catch (Exception e) {
			// handler code
			System.out.println("מישהו ניסה לחלק באפס");
			System.out.println(e.getClass());
		}

		System.out.println("end");
	}

}
