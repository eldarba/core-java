package f.waitAndNotify;

public class Consumer extends Thread {

	private Stack stack;
	private int amountToConsume; // how many elements to pop
	private long sleepTime;

	public Consumer(Stack stack, int amountToConsume, long sleepTime, String name) {
		super(name);
		this.stack = stack;
		this.amountToConsume = amountToConsume;
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {

		for (int i = 0; i < amountToConsume; i++) {

			int poppedVal = stack.pop();
			System.out.println(getName() + " popped " + poppedVal);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
