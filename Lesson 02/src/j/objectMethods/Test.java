package j.objectMethods;

import java.util.HashSet;
import java.util.Set;

import d.persons.revisited.Person;

public class Test {
	public static void main(String[] args) {

		Set<Person> set = new HashSet<Person>();
		set.add(new Person(101, "aaa", 55));

		boolean b = set.contains(new Person(101, "aaa", 55));
		System.out.println(b);

	}
}
