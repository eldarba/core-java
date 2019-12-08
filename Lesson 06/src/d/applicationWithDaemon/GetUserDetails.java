package d.applicationWithDaemon;

import java.util.Date;
import java.util.Scanner;

public class GetUserDetails {

	public static void main(String[] args) {

		ShowDate t = new ShowDate();
		t.setDaemon(true);
		t.start();

		Scanner sc = new Scanner(System.in);
		int id;
		String name;

		System.out.print("Enter id: ");

		id = Integer.parseInt(sc.nextLine());
		System.out.print("Enter name: ");
		name = sc.nextLine();
		sc.close();

		System.out.println("Thank you " + name + " [" + id + "]");
	}
}

class ShowDate extends Thread {
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(new Date());
		}
	}
}
