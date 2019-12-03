package c.enumTypes;

public class Car {

	// static nested enum
	public enum CarMake {
		MAZDA, AUDI, MERCEDES;
	}

	private CarMake make;
	private int number;
	private int speed;
	private CarColor color;

	public Car(CarMake make, int number, int speed, CarColor color) {
		super();
		this.make = make;
		this.number = number;
		this.speed = speed;
		this.color = color;
	}

	public CarMake getMake() {
		return make;
	}

	public void setMake(CarMake make) {
		this.make = make;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public CarColor getColor() {
		return color;
	}

	public void setColor(CarColor color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", number=" + number + ", speed=" + speed + ", color=" + color + "]";
	}

}
