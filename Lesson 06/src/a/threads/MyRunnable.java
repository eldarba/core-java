package a.threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		/*
		 * since we are not extending thread, we don't have access to Thread's instance
		 * methods so we need a reference to the current thread.
		 */
		Thread currentThread = Thread.currentThread();

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + currentThread.getName()); // invoking Thread's instance method
			try {
				Thread.sleep(150);// send this thread to sleep for 500 ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
