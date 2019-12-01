package h.animals;

import h.animals.abstracts.Mammal;
import h.animals.interfaces.Flyer;

public class Bat extends Mammal implements Flyer {

	@Override
	public void speak() {
		System.out.println("speak like a bat");

	}

	@Override
	public void fly() {
		System.out.println("fly like a bat");
	}

}
