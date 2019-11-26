package c.persons;

public class Person {

	int id;
	String name;
	int age;

	// instance method
	void printName() {
		System.out.println("my name is: " + this.name);
	}

	// instance method
	void printAge() {
		System.out.println("my age is: " + age);
	}

	// class method
	static void whatIsAperson() {
		System.out.println("a person is an entity with id name and age");
	}
}
