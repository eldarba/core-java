package g.abstraction.shapes;

public abstract class Shape {

	// attributes
	private String color;

	// CTORs
	public Shape(String color) {
		super();
		this.color = color;
	}

	// concrete methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// abstract methods
	public abstract double getArea();

}
