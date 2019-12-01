package a.hashcode;

public class Person {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return id + 100 * 3 - 10_000;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}

		Person other = (Person) obj;

		return this.id == other.id;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this + " was gced");
	}

	public static void main(String[] args) throws InterruptedException {
		Person p1 = new Person(101, "aaa", 25);
		Person p2 = new Person(101, "bbb", 26);
		System.out.println(p1 + " hashcode: " + p1.hashCode());
		System.out.println(p2 + " hashcode: " + p2.hashCode());

		System.out.println("equals=" + p1.equals(p2));

		p1 = null;
		System.gc();

		Thread.sleep(2000);
	}

}
