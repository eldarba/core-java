package b.cars;

/**
 * This
 */
public class Car {

	// attributes
	String number;
	String color;
	int speed;

	void drive(int speed) {
		/*
		 * the "this" reference refers to the current object. the object that invoked
		 * the method
		 */
		this.speed = speed;
		System.out.println("Drive carefully at " + speed + " k/h");
	}

}
