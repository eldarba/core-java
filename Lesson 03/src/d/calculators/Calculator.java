package d.calculators;

public class Calculator {

	private double res;

	public void add(double val) {
		this.res += val;
	}

	public void sub(double val) {
		this.res -= val;
	}

	public void mul(double val) {
		this.res *= val;
	}

	public void div(double val) {
		this.res /= val;
	}

	public void reset() {
		this.res = 0;
	}

	public double getRes() {
		return this.res;
	}

	public static double sum(double a, double b) {
		double sum = a + b;
		return sum;
	}

}
