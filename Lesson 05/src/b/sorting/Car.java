package b.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Car implements Comparable<Car> {

	private int number; // natural order
	private String make;
	private int speed;

	public Car(int number, String make, int speed) {
		super();
		this.number = number;
		this.make = make;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", make=" + make + ", speed=" + speed + "]";
	}

	public static void main(String[] args) {

		Car c1 = new Car(999, "audi", 70);
		Car c2 = new Car(555, "volvo", 50);
		Car c3 = new Car(222, "mazda", 0);

		// static initialization of a list by converting varargs of a type to List
		List<Car> cars = Arrays.asList(c1, c2, c3);
		System.out.println(cars.getClass());

		for (Car car : cars) {
			System.out.println(car);
		}

		Collections.sort(cars);
		System.out.println("=============");

		for (Car car : cars) {
			System.out.println(car);
		}
	}

	@Override
	public int compareTo(Car other) {
		if (this.number < other.number) {
			return -1;
		} else if (this.number > other.number) {
			return 1;
		} else {
			return 0;
		}
	}

}
