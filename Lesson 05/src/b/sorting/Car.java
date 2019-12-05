package b.sorting;

import java.io.Serializable;

public class Car implements Comparable<Car>, Serializable {

	private transient int number; // natural order
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
