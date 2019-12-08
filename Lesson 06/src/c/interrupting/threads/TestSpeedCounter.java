package c.interrupting.threads;

public class TestSpeedCounter {

	public static void main(String[] args) throws InterruptedException {
		SpeedCounterThread speed1 = new SpeedCounterThread("speed1");
		speed1.start();

		Thread.sleep(10);
		// we want main to interrupt speed1 thread
		speed1.interrupt();

		System.out.println("MAIN ENDED");
	}
}
