package c;

public class Tar1 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i < 10; i++) {
			int r = (int) (Math.random() * 101);
			System.out.println(r);
			sum += r; // sum = sum + r
		}

		System.out.println("sum=" + sum);
		double avg = sum / 10D;
		System.out.println("avg=" + avg);
	}
}
