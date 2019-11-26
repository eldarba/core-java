package c.persons;

public class Test2 {

	public static void main(String[] args) {

		Employee e = new Employee();

		Person p = new Employee();

		printPersonName(p);
		printPersonName(e);

		p = new Person();

	}

	public static void printPersonName(Person p) {
		System.out.println(p.getName());
	}
}
