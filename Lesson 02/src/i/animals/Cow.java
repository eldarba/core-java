package i.animals;

public class Cow extends Mammal {
	@Override
	public void speak() {
		System.out.println("speak like a cow - moo");
	}

	public void eat() {
		System.out.println("cow is eating");
	}
}
