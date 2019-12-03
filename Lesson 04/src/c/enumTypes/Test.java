package c.enumTypes;

import c.enumTypes.Car.CarMake;

public class Test {

	public static void main(String[] args) {
		Car car1 = new Car(Car.CarMake.MAZDA, 101, 0, CarColor.WHITE);
		System.out.println(car1);

		car1.setColor(CarColor.YELLOW);
		System.out.println(car1);

		CarMake make = CarMake.AUDI;
	}
}
