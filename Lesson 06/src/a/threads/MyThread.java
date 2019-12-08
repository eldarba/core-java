package a.threads;

public class MyThread extends Thread {

	public MyThread(String name) {
		super(name);
	}

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + getName());
			try {
				Thread.sleep(600);// send this thread to sleep for 500 ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
