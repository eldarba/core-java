package b.wrrapers;

public class Demo1 {

	public static void main(String[] args) {
		int x = 5;
//		Integer y = new Integer(5);
		Integer y = 5; // inbox - put a primitive in object

		int a = y;

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		// convert string to int
		String str = "25A";
		int age = Integer.parseInt(str);
		System.out.println("age: " + age);

		// convert int to string
		int n = 536;
		String str2 = String.valueOf(n);

	}
}
