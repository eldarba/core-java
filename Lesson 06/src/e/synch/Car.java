package e.synch;

public class Car {

	private int id;
	private int km;

	public Car(int id) {
		super();
		this.id = id;
	}

	public synchronized void drive(int distance) {
		// drivers of this cur are threads
		Thread driver = Thread.currentThread();
		System.out.println(
				driver.getName() + " started with car " + id + " at " + km + " km for a distance of " + distance);
		km += distance;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(driver.getName() + " finished with car " + id + " at " + km);
	}

	public int getId() {
		return id;
	}

	public int getKm() {
		return km;
	}

}
