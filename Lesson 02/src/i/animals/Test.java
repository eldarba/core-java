package i.animals;

public class Test {

	public static void main(String[] args) {
		Animal[] animals = new Animal[10];

		animals[0] = new Dog(); // upcast - implicit
		animals[1] = new Cow(); // upcast - implicit
		animals[2] = new Ant(); // upcast - implicit
		animals[3] = new Dog(); // upcast - implicit
		animals[7] = new Dog(); // upcast - implicit

		for (Animal animal : animals) {
//////////////////////////////
			// compiles but fails at runtime
//			Cow cow2 = (Cow) animal; // down cast - explicit
//			cow2.eat();
/////////////////////////////////

			if (animal != null) {
				animal.speak();
				if (animal instanceof Dog) {
					Dog dog = (Dog) animal; // down cast - explicit
					dog.wiggle();
				}
				if (animal instanceof Cow) {
					Cow cow = (Cow) animal; // down cast - explicit
					cow.eat();
//					((Cow)animal).eat();
				}
			} else {
				System.out.println(animal);
			}

			System.out.println("===========");
		}
	}
}
