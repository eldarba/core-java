package d.exceptions;

public class Demo4 {

	public static void main(String[] args) {

		try {
			int x = Integer.parseInt("23");

			int[] arr = new int[5];
			arr[10] = 11;

			String s = "aaa";
			s = null;
			System.out.println(s.length());

			System.out.println("success");

		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("parseInt failed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array push failed");
		} catch (NullPointerException e) {
			System.out.println("null pointer");
		} catch (Exception e) {
			System.out.println("some other exception");
		}
	}

}
