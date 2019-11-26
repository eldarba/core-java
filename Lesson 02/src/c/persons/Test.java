package c.persons;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

//		p1.name = "David";
		p1.setName("David");
		p2.setName("Lea");
//		p1.age = 40;
//		p2.age = 30;
		p1.setAge(40);
		p2.setAge(30);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p3.getName());
		System.out.println(p3.getAge());

		System.out.println("===========");
		p1.printName();
		p2.printName();
		p3.printName();

		Person.whatIsAperson();
		p1.whatIsAperson();
	}
}
