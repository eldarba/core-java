package c.staticDemo;

public class Car {

	// static field - class variable
	private static int carCounter;
	private static final int MAX_SPEED = 120; // constant

	// static method - class method
	public static int getCarCounter() {
		return carCounter;
	}

	// (dynamic) instance variables
	private final int number; // blank final - must initialize
	private int speed;
	private String color;

	{ // initializer - runs on object creation before CTOR
		carCounter++;
	}

	public Car() {
		this.number = carCounter;
	}

	public Car(int speed, String color) {
		super();
		this.number = carCounter;
		setSpeed(speed);
		this.color = color;
	}

	// (dynamic) instance methods
	public int getNumber() {
		return number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed <= MAX_SPEED) {
			this.speed = speed;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		// the this reference exist only in instance methods
		Car.this.color = color;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + ", color=" + color + "]";
	}

}
