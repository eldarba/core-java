package h.animals;

import h.animals.abstracts.Bird;
import h.animals.interfaces.Flyer;
import h.animals.interfaces.Navigator;

public class Hawk extends Bird implements Flyer, Navigator {

	@Override
	public void navigate() {
		System.out.println("navigate like a hawk");
	}

	@Override
	public void fly() {
		System.out.println("fly like a hawk");
	}

	@Override
	public void speak() {
		System.out.println("speak like a hawk");
	}

}
