package g.lines;

// final class cannot be extended
public final class WLine extends Line {

	private int width;

	public WLine(int length, int width) {
		super(length);
		this.width = width;
	}

	@Override
	public void print() {
		for (int i = 0; i < width; i++) {
			super.print(); // invoke the super version of the method
		}
	}

}
