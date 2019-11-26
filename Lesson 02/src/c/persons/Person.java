package c.persons;

public class Person {

	private int id;
	private String name;
	private int age;

	/**
	 * get the age of the person
	 *
	 * @return the age of the person
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * set the age of the person
	 * 
	 * @param age the new age
	 */
	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}
	}

	{ // initializer - runs before any CTOR
		System.out.println("person creted");
	}

	// CTOR 1
	public Person() {
		this(18); // invoke other CTOR in this class
//		super();
//		age = 18;
	}

	// CTOR 2 - overload
	public Person(int age) {
		super(); // invoke other CTOR in super class
		this.age = age;
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	// instance method
	public void printName() {
		System.out.println("my name is: " + this.name);
	}

	// instance method
	public void printAge() {
		System.out.println("my age is: " + age);
	}

	// class method
	static public void whatIsAperson() {
		System.out.println("a person is an entity with id name and age");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
