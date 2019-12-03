package d.exceptions;

public class Demo3Checked {

	public static void main(String[] args) {

		try { // must handle
			Class.forName("c.enumTypes.Carz");
			System.out.println("class loaded");
		} catch (ClassNotFoundException e) {
			System.out.println("class loading failed");
			e.printStackTrace();
			return;
		} finally { // do it anyway block
			System.out.println("do it anyway");
		}

		System.out.println("end");

	}
}
