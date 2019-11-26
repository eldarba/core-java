package e.methodOverload;

public class Calculator {

	// method
	public double sum(double a, double b) {
		return a + b;
	}

	// method overload
	public double sum(double a, double b, double c) {
		return a + b + c;
	}

	// varargs
	public double sum(double... values) {
		// in the method the parameter "values" is an array of double
		double sum = 0;
		// for-each loop
		for (double currentElement : values) {
			sum += currentElement;
		}
		return sum;
	}

	// varargs is the last parameter
	public double sum(String name, double... values) {
		// in the method the parameter "values" is an array of double
		double sum = 0;
		// for-each loop
		for (double currentElement : values) {
			sum += currentElement;
		}
		return sum;
	}

	// duplicate method signature
//	public double sum(double[] values) {
//		return 0;
//	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.sum(10, 15));
		System.out.println(c.sum(10, 15, 30));
		System.out.println(c.sum(10, 15, 30, 77, 98));
	}

}
