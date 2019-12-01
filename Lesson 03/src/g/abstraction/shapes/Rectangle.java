package g.abstraction.shapes;

// concrete class
public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	// must implement the inherited abstract methods
	@Override
	public double getArea() {
		return length * width;
	}

}
