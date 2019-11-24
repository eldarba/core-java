package a;

public class Primitives {

	public static void main(String[] args) {
		// integers
		byte n1 = 127;
		short n2 = 32767;
		int n3 = 2147483647;
		long n4 = 9223372036854775807L;

		// decimals
		float f1 = 5.3F;
		double f2 = 5.3;

		System.out.println(0.333333333333333333333333F);
		System.out.println(0.333333333333333333333333D);

		// characters
		char c1 = 'A';
		char c2 = 65;
		char c3 = 'à';
		char c4 = 1488;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

		// logical
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = 10 < 100;
		boolean b4 = 10 > 100;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
	}

}
