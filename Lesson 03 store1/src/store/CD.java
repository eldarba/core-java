package store;

public class CD {

	private String name;
	private String band;
	private double price;

	public CD(String name, String band, double price) {
		super();
		this.name = name;
		this.band = band;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [name=" + name + ", band=" + band + ", price=" + price + "]";
	}

}
