package g.abstraction.shapes;

public class Test {

	public static void main(String[] args) {
		Shape s = new Rectangle("Blue", 5, 10);
		System.out.println("area: " + s.getArea());
	}

}
