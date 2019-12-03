package c.enumTypes.planets;

public enum Planet {

	// the constants - planets
	VENUS(8, 3000), EARTH(5, 1000), MARS(3, 1500);

	// CTOR
	private Planet(int mass, int orbit) {
		this.mass = mass;
		this.orbit = orbit;
	}

	// attributes
	private int mass;
	private int orbit;

	// methods
	public int getMass() {
		return mass;
	}

	public int getOrbit() {
		return orbit;
	}

}
