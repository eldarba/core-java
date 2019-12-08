package c.interrupting.threads;

public class DaemonsDemo {

	public static void main(String[] args) throws InterruptedException {

		SleepCounterThread s1App = new SleepCounterThread("s1 - application");
		SleepCounterThread s2Daemon = new SleepCounterThread("s2 - daemon");
		s2Daemon.setDaemon(true);

		s1App.start();
		s2Daemon.start();

		Thread.sleep(5000);

		/*
		 * will stop the Application (JVM will stop) if there are no more application
		 * threads running)
		 */
		// s1App.interrupt();

		/* will not stop the application if there are running application threads */
		s2Daemon.interrupt();

	}

}
