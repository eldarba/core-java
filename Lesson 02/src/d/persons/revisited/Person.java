package d.persons.revisited;

public class Person {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		setId(id);
		setName(name);
		setAge(age);
	}

	public Person(int id) {
		super();
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}