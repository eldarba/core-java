package b.threads.state;

import a.threads.MyThread;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		MyThread t1 = new MyThread("t1");
		System.out.println(t1.getState());

		t1.start();
		System.out.println(t1.getState());

		Thread.sleep(300); // hold the main thread
		System.out.println(t1.getState());

		// we want main to wait for t1 to terminate
		t1.join();
		// if we are here t1 is terminated
		System.out.println(t1.getState());

	}

}
