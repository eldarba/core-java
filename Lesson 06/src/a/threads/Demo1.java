package a.threads;

public class Demo1 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		MyThread t1 = new MyThread("t1"); // create a thread object
		MyThread t2 = new MyThread("t2"); // create a thread object

		t1.start(); // start the thread - will create a new stack for this thread and than invoke
					// the run method
		t2.start();

		Thread mainThread = Thread.currentThread();

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + mainThread.getName());
			Thread.sleep(1000); // send this thread to sleep for 500 ms

		}
	}

}
