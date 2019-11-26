package i.animals;

public class Dog extends Mammal {

	@Override
	public void speak() {
		System.out.println("speak like a dog - woof");
	}

	public void wiggle() {
		System.out.println("dog wiggles");
	}

}
