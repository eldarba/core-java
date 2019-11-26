package j.objectMethods;

import d.persons.revisited.Person;

public class Demo1 {

	public static void main(String[] args) {

		Person p1 = new Person(101, "aaa", 25);
		Person p2 = new Person(101, "bbb", 35);

		System.out.println(p1.toString());
		System.out.println(p1.hashCode());
		System.out.println(p1.equals(p2));
	}

}
