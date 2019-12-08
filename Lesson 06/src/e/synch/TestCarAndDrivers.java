package e.synch;

public class TestCarAndDrivers {

	public static void main(String[] args) {

		Car car = new Car(111);
		Car car2 = new Car(222); // if drivers use different cars the go simultaneously

		CarDriverThread moshe = new CarDriverThread("Moshe", car);
		CarDriverThread danna = new CarDriverThread("Danna", car);

		moshe.start();
		danna.start();
	}
}
