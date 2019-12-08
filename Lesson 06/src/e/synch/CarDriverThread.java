package e.synch;

public class CarDriverThread extends Thread {

	private Car car;

	public CarDriverThread(String driverName, Car car) {
		super(driverName);
		this.car = car;
	}

	@Override
	public void run() {
		int distance = (int) (Math.random() * 301) + 100;
		car.drive(distance);
	}

}
