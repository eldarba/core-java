package c;

public class Tar7 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 10_001);
		System.out.println(random);
		int sum = 0;

		while (random != 0) {
			int digit = random % 10;
			sum += digit;
			random /= 10;
		}

		System.out.println("sum of digits: " + sum);
	}
}
