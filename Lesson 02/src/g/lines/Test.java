package g.lines;

public class Test {

	public static void main(String[] args) {
		Line line = new Line(5);
		line.print();

		line.setLength(12);
		line.print();

		System.out.println("===================");

		line = new WLine(8, 3);
		line.print();
	}
}
