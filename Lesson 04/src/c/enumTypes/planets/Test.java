package c.enumTypes.planets;

public class Test {

	public static void main(String[] args) {

		Planet p = Planet.VENUS;

		System.out.println(p + ", mass: " + p.getMass() + ", orbit: " + p.getOrbit());

	}
}
