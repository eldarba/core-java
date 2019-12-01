package c.staticDemo;

public class Test {

	public static void main(String[] args) {

		System.out.println("car made: " + Car.getCarCounter());

		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();

		System.out.println("car made: " + Car.getCarCounter());
	}
}
