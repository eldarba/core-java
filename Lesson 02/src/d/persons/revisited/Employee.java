package d.persons.revisited;

public class Employee extends Person {

	private double salary;

	public Employee(int id, String name, int age) {
		super(id, name, age);
	}

	public Employee() {
		this(0, null, 0);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
