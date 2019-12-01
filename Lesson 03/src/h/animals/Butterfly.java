package h.animals;

import h.animals.abstracts.Insect;
import h.animals.interfaces.AdvancedFlyer;

public class Butterfly extends Insect implements AdvancedFlyer {

	@Override
	public void fly() {
		System.out.println("fly like a butterfly");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a butterfly");
	}

	@Override
	public void takeOff() {
		System.out.println("takeOff like a butterfly");
	}

	@Override
	public void land() {
		System.out.println("land like a butterfly");
	}

	@Override
	public void speak() {
		System.out.println("speak like a butterfly");
	}

}
