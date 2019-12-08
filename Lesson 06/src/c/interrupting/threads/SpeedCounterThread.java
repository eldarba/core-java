package c.interrupting.threads;

public class SpeedCounterThread extends Thread {

	public SpeedCounterThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
			if (this.isInterrupted()) {
				System.out.println(getName() + " interrupted and will terminate");
				break;
			}
		}

		System.out.println(getName() + " terminate");
	}

}
