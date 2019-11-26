package f.shapes;

public class Test {

	public static void main(String[] args) {

		// declare a reference
		Shape shape;

		shape = new Rectangle(4, 3);
		System.out.println(shape.getArea());

		shape = new Circle(7);
		System.out.println(shape.getArea());

	}

}
