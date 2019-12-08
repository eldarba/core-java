package f.waitAndNotify;

public class Producer extends Thread {

	private Stack stack;
	private int amountToProduce; // how many elements to push
	private long sleepTime;

	public Producer(Stack stack, int amountToProduce, long sleepTime, String name) {
		super(name);
		this.stack = stack;
		this.amountToProduce = amountToProduce;
		this.sleepTime = sleepTime;
	}

	@Override
	public void run() {

		for (int i = 0; i < amountToProduce; i++) {
			int r = (int) (Math.random() * 26); // 0 - 26 values range
			stack.push(r);
			System.out.println(getName() + " produced " + r);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
