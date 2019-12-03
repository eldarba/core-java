package c.enumTypes.planets;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Planet.values() - returns an array of all constants
		System.out.println("enter planet name: " + Arrays.toString(Planet.values()));
		String str = sc.nextLine();
		System.out.println(str);

		// Planet.valueOf(str)
		// convert from String to Planet
		Planet p = Planet.valueOf(str);

		// p.ordinal() - the index of this
		System.out.println(p + ", mass: " + p.getMass() + ", orbit: " + p.getOrbit() + ", ordinal: " + p.ordinal());
		sc.close();

	}
}
