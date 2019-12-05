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
