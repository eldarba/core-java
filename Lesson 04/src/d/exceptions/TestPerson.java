package d.exceptions;

public class TestPerson {

	public static void main(String[] args) {

		Person p = new Person();
		try {
			p.setAge(10);
			System.out.println("age is: " + p.getAge());
			p.setAge(25);
			System.out.println("age is: " + p.getAge());
			p.setAge(1110);
			System.out.println("age is: " + p.getAge());
			p.setAge(10);
			System.out.println("age is: " + p.getAge());
		} catch (PersonAgeException e) {
			e.printStackTrace();
			try {
				p.setAge(18);
				System.out.println("age is: " + p.getAge());
			} catch (PersonAgeException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
