package h.animals;

import h.animals.abstracts.Mammal;
import h.animals.interfaces.Navigator;

public class Dog extends Mammal implements Navigator {

	@Override
	public void speak() {
		System.out.println("speak like a dog - woof");
	}

	public void wiggle() {
		System.out.println("dog wiggles");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like a dog");
	}

}
