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

	// final method cannot be overridden
	public final int getId() {
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		} else {
//			Person other = (Person) obj;
//			return this.id == other.id;
			return this.id == ((Person) obj).id;
		}
	}

	@Override
	public int hashCode() {
		return id;
	}

}
