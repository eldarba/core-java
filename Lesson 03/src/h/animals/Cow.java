package h.animals;

import h.animals.abstracts.Mammal;

public class Cow extends Mammal {
	@Override
	public void speak() {
		System.out.println("speak like a cow - moo");
	}

	public void eat() {
		System.out.println("cow is eating");
	}
}
