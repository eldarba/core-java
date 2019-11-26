package b.cars;

public class Test {

	public static void main(String[] args) {

		// create 2 Car instances
		Car c1 = new Car();
		Car c2 = new Car();

		c1.speed = 80;
		c2.speed = 100;

		System.out.println(c1.speed);
		System.out.println(c2.speed);

		c1.drive(300);

	}

}
