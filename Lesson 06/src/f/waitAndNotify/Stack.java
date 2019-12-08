package f.waitAndNotify;

import java.util.ArrayList;
import java.util.List;

public class Stack {

	private List<Integer> list = new ArrayList<>();
	public static final int MAX = 10;

	public synchronized void push(int val) {
		while (list.size() == MAX) {
			try {
				System.out.println(Thread.currentThread().getName() + " is waiting");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		list.add(val);
		notify();
	}

	public synchronized int pop() {
		while (list.isEmpty()) {
			try {
				System.out.println(Thread.currentThread().getName() + " is waiting");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int val = list.remove(list.size() - 1);
		notify();
		return val;
	}

}
