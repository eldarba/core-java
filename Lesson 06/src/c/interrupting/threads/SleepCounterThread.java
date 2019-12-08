package c.interrupting.threads;

public class SleepCounterThread extends Thread {

	public SleepCounterThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " - " + getName());

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// handler - what the thread will if interrupted
				System.out.println(getName() + " interrupted and will terminate");
				break;
			}

		}

		System.out.println(getName() + " terminate");
	}

}
