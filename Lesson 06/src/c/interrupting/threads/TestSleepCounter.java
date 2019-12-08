package c.interrupting.threads;

public class TestSleepCounter {

	public static void main(String[] args) throws InterruptedException {
		SleepCounterThread sleep1 = new SleepCounterThread("sleep1");
		sleep1.start();

		Thread.sleep(3500);
		// we want main to interrupt sleep1 thread
		sleep1.interrupt();

		System.out.println("MAIN ENDED");
	}
}
